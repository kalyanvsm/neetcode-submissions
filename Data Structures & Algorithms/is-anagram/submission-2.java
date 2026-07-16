class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alp = new int[26];
        int sLen = s.length();
        int tLen = t.length();
        for(int i = 0; i < sLen; i++) alp['z' - s.charAt(i)]++;

        for(int i = 0; i < tLen; i++) alp['z' - t.charAt(i)]--;

        for(int i : alp){
            if(i != 0) return false;
        }

        return true;
    }
}
