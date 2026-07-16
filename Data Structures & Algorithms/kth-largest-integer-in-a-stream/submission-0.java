class KthLargest {
    public PriorityQueue<Integer> pq;
    public int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.pq = new PriorityQueue<>();

        for(int n : nums) add(n);
    }
    
    public int add(int val) {
        if(pq.size() < k) pq.offer(val);
        else if(val > pq.peek()){
            pq.poll();
            pq.offer(val);
        }
        return pq.peek();
    }
}
