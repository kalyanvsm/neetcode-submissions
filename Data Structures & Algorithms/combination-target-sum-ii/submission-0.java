class Solution {
    public List<List<Integer>> ans;
    public List<Integer> temp;

    public void backtrack(int[] nums, int ind, int target){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = ind; i < nums.length; i++){
            if(i > ind && nums[i] == nums[i - 1]) continue;

            if(nums[i] > target) break;

            temp.add(nums[i]);
            backtrack(nums, i + 1, target - nums[i]);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        temp = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, 0, target);
        return ans;
    }
}
