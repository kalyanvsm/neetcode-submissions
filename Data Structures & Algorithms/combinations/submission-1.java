class Solution {
    public List<List<Integer>> ans;
    public List<Integer> temp;
    public void backtrack(int start, int n, int k){
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start; n - i + 1 >= k - temp.size(); i++){
            temp.add(i);
            backtrack(i + 1, n , k);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        temp = new ArrayList<>();

        backtrack(1, n, k);
        return ans;
    }
}