class Solution {
    public List<List<Integer>> ans;
    public List<Integer> temp;
    public void backtrack(int[] nums, int ind, int k){
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (ind == nums.length) return;

        // not choose
        backtrack(nums, ind + 1, k);

        // choose
        temp.add(nums[ind]);
        backtrack(nums, ind + 1, k);
        temp.remove(temp.size() - 1);
    }
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        temp = new ArrayList<>();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) nums[i] = i + 1;
        backtrack(nums, 0, k);
        return ans;
    }
}