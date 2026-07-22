class Solution {
public:
    bool isPalindrome(string s) {
        int i = 0, j = s.length() - 1;

        while(i < j){
            char ch1 = tolower(s[i]), ch2 = tolower(s[j]);
            
            if(!isalnum(ch1)) i++;
            else if(!isalnum(ch2)) j--;
            else if(ch1 != ch2) return false;
            else{
                i++;
                j--;
            }
        }

        return true;
    }
};
