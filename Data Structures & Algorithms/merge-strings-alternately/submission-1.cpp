class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int i = 0;
        int j = 0;
        int n1 = word1.size();
        int n2 = word2.size();
        string s = "";

        while(i < n1 || j < n2){
            if(i < n1) s += word1[i++];
            if(j < n2) s += word2[j++];
        }

        return s;

    }
};