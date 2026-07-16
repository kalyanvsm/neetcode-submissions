class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) set.add(num);

        int max = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int c = 0;
                int t = num;
                while(set.contains(t)){
                    c++;
                    t++;
                }

                if(max < c) max = c;
            }
        }
        
        return max;
    }
}
