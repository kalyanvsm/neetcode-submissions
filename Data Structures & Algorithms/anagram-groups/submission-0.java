class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] alp = new int[26];

            for(char c : s.toCharArray()) alp[c - 'a']++;

            String key = "";

            for(int num : alp) key += (num + "#");

            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
