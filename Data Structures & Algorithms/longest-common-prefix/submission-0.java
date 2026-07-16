class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        String minLenStr = "";

        for(String s : strs){
            if(s.length() < minLen){
                minLen = s.length();
                minLenStr = s;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < minLen; i++){
            char ch = minLenStr.charAt(i);
            for(String s : strs){
                if(ch != s.charAt(i)) return sb.toString();
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}