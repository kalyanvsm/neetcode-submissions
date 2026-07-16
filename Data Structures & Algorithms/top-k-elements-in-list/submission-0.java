class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            if(!map.containsKey(i)) map.put(i , 1);
            else map.put(i, map.get(i) + 1);
        }

        List<Integer>[] bucks = new List[nums.length + 1];

        for(int i = 0; i <= nums.length; i++){
            bucks[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int freq = e.getValue();
            int num = e.getKey();
            bucks[freq].add(num);
        }

        List<Integer> res = new ArrayList<>();
        for(int i = bucks.length - 1; i >= 0 && res.size() < k; i--){
            res.addAll(bucks[i]);
        }

        int[] topK = new int[k];
        for(int i = 0; i < k; i++) topK[i] = res.get(i);

        return topK;
    }
}
