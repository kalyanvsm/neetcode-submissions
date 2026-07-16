class Solution {
    public List<List<Integer>> ans;
    public List<Integer> temp;
    public void backtrack(int[] nums, int ind){
        ans.add(new ArrayList<>(temp));

        for(int i = ind; i < nums.length; i++){
            if(i > ind && nums[i] == nums[i - 1]) continue;

            temp.add(nums[i]);
            backtrack(nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ans = new ArrayList<>();
        temp = new ArrayList<>();
        backtrack(nums, 0);
        return ans;
    }
}
