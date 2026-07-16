class Solution {
public:
    bool isAnagram(string s, string t) {
        vector<int> seen(26);

        for (char ch : s){
            seen[ch - 'a']++;
        }

        for (char ch : t){
            seen[ch - 'a']--;
        }

        for (int i : seen){
            if (i != 0) return false;
        }

        return true;
    }
};
