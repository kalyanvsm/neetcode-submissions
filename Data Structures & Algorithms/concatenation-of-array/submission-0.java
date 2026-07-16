class Solution {
    public int[] getConcatenation(int[] nums) {
        int n1 = nums.length;
        int n2 = n1 * 2;
        int[] res = new int[n2];

        for(int i = 0; i < n2; i++) res[i] = nums[i % n1];

        return res;
    }
}