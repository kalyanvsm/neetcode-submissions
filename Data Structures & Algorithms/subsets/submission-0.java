class Solution {
    public List<List<Integer>> res;
    public List<Integer> temp;
    public void backtrack(int[] nums, int ind){
        if(ind == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        // not choose
        backtrack(nums, ind + 1);

        // choose
        temp.add(nums[ind]);
        backtrack(nums, ind + 1);

        temp.remove(temp.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        temp = new ArrayList<>();
        backtrack(nums, 0);
        return res;
    }
}
