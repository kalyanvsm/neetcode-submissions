class Solution {
    public int originDist(int[] p){
        return (p[0] * p[0]) + (p[1] * p[1]);
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> originDist(b) - originDist(a)
        );

        for(int[] p : points){
            pq.offer(p);
            if(pq.size() > k) pq.poll();
        }

        int[][] ans = new int[k][2];

        int i = 0;
        while(!pq.isEmpty()){
            ans[i++] = pq.poll();
        }

        return ans;
    }
}
