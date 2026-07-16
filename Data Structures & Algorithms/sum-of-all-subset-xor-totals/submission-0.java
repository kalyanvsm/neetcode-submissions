class Solution {
    public int sum = 0;
    public void backtrack(int[] nums, int ind, int currXOR){
        if(ind == nums.length){
            sum += currXOR;
            return;
        }

        // not choose
        backtrack(nums, ind + 1, currXOR);

        // choose
        backtrack(nums, ind + 1, currXOR ^ nums[ind]);

    }
    public int subsetXORSum(int[] nums) {
        backtrack(nums, 0, 0);
        return sum;
    }
}