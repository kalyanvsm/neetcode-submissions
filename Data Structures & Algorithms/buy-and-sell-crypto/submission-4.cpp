class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxProfit = 0;
        int min = 1000;
        for(int i = 0; i < prices.size(); i++){
            if(min > prices[i]) min = prices[i];
            else{
                if(maxProfit < prices[i] - min) maxProfit = prices[i] - min;
            }
        }

        return maxProfit;
    }
};
