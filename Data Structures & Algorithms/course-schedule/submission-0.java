class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> g = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            g.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites){
            int c = pre[0];
            int p = pre[1];
            g.get(p).add(c);
        }

        int[] vis = new int[numCourses];

        for(int i = 0; i < numCourses; i++){
            if(vis[i] == 0){
                if(!dfs(i, g, vis)) return false;
            }
        }

        return true;
    }

    public boolean dfs(int c, List<List<Integer>> g, int[] vis){
        if(vis[c] == 1) return false;

        if(vis[c] == 2) return true;

        vis[c] = 1;

        for(int next : g.get(c)){
            if(!dfs(next, g, vis)){
                return false;
            }
        }

        vis[c] = 2;

        return true;
    }
}
