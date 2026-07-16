class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;

        while(i < j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(!Character.isLetterOrDigit(ch1)){
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(ch2)){
                j--;
                continue;
            }

            if(ch1 != ch2) return false;
            i++;
            j--;
        }

        return true;
    }
}
