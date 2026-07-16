class Solution {
    public List<String> getNeighbors(String curr){
        List<String> neighbors = new ArrayList<>();
        char[] chars = curr.toCharArray();

        for(int i = 0; i < 4; i++){
            char ch = chars[i];

            chars[i] = ch == '9' ? '0' : (char)(ch + 1);
            neighbors.add(new String(chars));

            chars[i] = ch == '0' ? '9' : (char)(ch - 1);
            neighbors.add(new String(chars));

            chars[i] = ch;
        }

        return neighbors;
    }
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        if(dead.contains("0000")) return -1;

        Queue<String> q = new LinkedList<>();
        q.offer("0000");
        Set<String> vis = new HashSet<>();
        vis.add("0000");

        int steps = 0;

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i < size; i++){
                String curr = q.poll();
                if(curr.equals(target)) return steps;
                if(dead.contains(curr)) continue;

                for(String s : getNeighbors(curr)){
                    if(!vis.contains(s) && !dead.contains(s)){
                        vis.add(s);
                        q.offer(s);
                    }
                }
            }
            steps++;
        }

        return -1;
    }
}