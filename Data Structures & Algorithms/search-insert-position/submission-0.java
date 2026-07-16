class Solution {
    public int BS(int[] nums, int l, int r, int t){
        if(l > r) return l;
        
        int mid = l + (r - l) / 2;
        if(nums[mid] == t) return mid;
        else if(t < nums[mid]) return BS(nums, l, mid - 1, t);
        else return BS(nums, mid + 1, r, t);
    }
    public int searchInsert(int[] nums, int target) {
        return BS(nums, 0, nums.length - 1, target);
    }
}