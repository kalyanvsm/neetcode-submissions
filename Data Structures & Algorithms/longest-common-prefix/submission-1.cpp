class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string s = "";
        string smallest = strs[0];

        for(string str : strs){
            if(str.size() < smallest.size()) smallest = str;
        }

        for(int i = 0; i < smallest.size(); i++){
            for(string str : strs){
                if(str[i] != smallest[i]) return s;
            }
            s += smallest[i];
        }

        return s;
    }
};