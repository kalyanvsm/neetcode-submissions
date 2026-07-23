class Solution {
public:
    string getCode(string a){
        vector<int> alp(26,0);

        for(char ch : a) alp[ch - 'a']++;

        string code = "";

        for(int i = 0; i < 26; i++){
            if(alp[i] > 0) code += (char)(i + (int)'a') + to_string(alp[i]) + "#";
        }

        return code;
    }

    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> mp;

        for(string s : strs){
            string code = getCode(s);
            
            mp[code].push_back(s);
        }

        vector<vector<string>> group;

        for(auto [key, val] : mp){
            group.push_back(val);
        }

        return group;
    }
};
