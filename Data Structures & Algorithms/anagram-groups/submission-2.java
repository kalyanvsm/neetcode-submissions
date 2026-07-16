class Solution {
    public String getAlphaArray(String s){
        int[] arr = new int[26];
        int sLen = s.length();

        for(int i = 0; i < sLen; i++) arr[s.charAt(i) - 'a']++;

        String ans = "";

        for(int num : arr) ans += (num + "#");

        return ans;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            String key = getAlphaArray(s);
            if(map.containsKey(key)){
                List<String> l = map.get(key);
                l.add(s);
                map.put(key, l);
            }else{
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(key, l);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        map.forEach((key, value) ->
            ans.add(value)
        );

        return ans;
    }
}
