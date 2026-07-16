class Solution {
    public List<List<Integer>> res;
    public List<Integer> temp;
    public void backtrack(int[] nums, int ind, int target){
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }

        if(target < 0 || ind == nums.length) return;

        temp.add(nums[ind]);
        backtrack(nums, ind, target - nums[ind]);
        temp.remove(temp.size() - 1);

        backtrack(nums, ind + 1, target);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        temp = new ArrayList<>();
        backtrack(nums, 0, target);
        return res;
    }
}
