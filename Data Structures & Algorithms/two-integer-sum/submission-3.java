class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int numsLen = nums.length;
        for(int i = 0; i < numsLen; i++){
            if(map.isEmpty()) map.put(nums[i], i);
            else if(map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]), i};
            }else{
                map.put(nums[i], i);
            }
        }

        return new int[2];
    }
}
