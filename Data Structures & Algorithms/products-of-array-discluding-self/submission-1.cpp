class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> prefix(nums.size(), 0);
        vector<int> suffix(nums.size(), 0);
        prefix[0] = 1;
        suffix[suffix.size() - 1] = 1;
        for(int i = 1, j = suffix.size() - 2; i < prefix.size() && j >= 0; i++, j--){
            prefix[i] = prefix[i - 1] * nums[i - 1];
            suffix[j] = suffix[j + 1] * nums[j + 1];
        }

        vector<int> ans(nums.size(), 0);

        for(int i = 0; i < nums.size(); i++){
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }
};
