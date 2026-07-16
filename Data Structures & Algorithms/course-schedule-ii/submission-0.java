class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> g = new ArrayList<>();

        for(int i = 0; i < numCourses; i++) g.add(new ArrayList<>());

        int[] inDegree = new int[numCourses];

        for(int[] pre : prerequisites){
            int c = pre[0];
            int p = pre[1];

            g.get(p).add(c);
            inDegree[c]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0) q.offer(i);
        }

        int[] order = new int[numCourses];
        int idx = 0;

        while(!q.isEmpty()){
            int c = q.poll();
            order[idx++] = c;

            for(int next : g.get(c)){
                inDegree[next]--;
                if(inDegree[next] == 0) q.offer(next);
            }
        }

        if(idx != numCourses) return new int[0];

        return order;
    }
}
