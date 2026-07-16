class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> mySet;

        for (int i : nums){
            mySet.insert(i);
        }

        return !(mySet.size() == nums.size());
    }
};