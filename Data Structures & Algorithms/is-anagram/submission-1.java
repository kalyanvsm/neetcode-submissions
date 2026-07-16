class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if(sLength != tLength) return false;

        int[] arr = new int[26];

        for(int i = 0; i < sLength; i++) arr[s.charAt(i) - 'a']++;

        for(int i = 0; i < tLength; i++) arr[t.charAt(i) - 'a']--;

        for(int i = 0; i < 26; i++){
            if(arr[i] != 0) return false;
        }

        return true;
    }
}
