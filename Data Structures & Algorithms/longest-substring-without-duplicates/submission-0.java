class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, maxLen = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();

        for(int j = 0; j < n; j++){
            char ch = s.charAt(j);

            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}
