class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        priority_queue<int, vector<int>> pq;

        for(int stone : stones) pq.push(stone);

        while(pq.size() > 1){
            int stone1 = pq.top();
            pq.pop();
            int stone2 = pq.top();
            pq.pop();

            int remain = abs(stone1 - stone2);
            if(remain > 0) pq.push(remain);
        }

        if(pq.size() == 0) return 0;
        return pq.top();
    }
};
