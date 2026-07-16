class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String ss = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if((ch <= 'z' && ch >= 'a') || (ch <= '9' && ch >= '0')) ss += ch;
        }

        int i = 0, j = ss.length() - 1;

        while(i < j){
            char iChar = ss.charAt(i);
            char jChar = ss.charAt(j);

            if(iChar == jChar){
                i++;
                j--;
            }else return false;
        }

        return true;
    }
}
