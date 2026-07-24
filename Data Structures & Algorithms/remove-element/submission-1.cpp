class Solution {
public:
    int removeElement(vector<int>& nums, int val) {

        int currPos = 0;
        
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] != val) nums[currPos++] = nums[i];
        }

        return currPos;
    }
};