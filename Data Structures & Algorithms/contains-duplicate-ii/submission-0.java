class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length < 2) return false;
        int i = 0, j = 0;
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        while(j <= k && j < n){
            set.add(nums[j]);
            j++;
        }

        if(j - i != set.size()) return true;

        while(j < n){
            set.remove(nums[i++]);
            set.add(nums[j++]);

            if(j - i != set.size()) return true;
        }

        return false;
    }
}