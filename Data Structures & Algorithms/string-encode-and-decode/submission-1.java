class Solution {

    public String encode(List<String> strs) {
        String ans = "";

        for(String s : strs) ans += (s.length() + "#" + s);

        return ans;
    }

    public List<String> decode(String str) {
        int i = 0, j = str.length() - 1;
        
        List<String> ans = new ArrayList<>();

        while(i <= j){
            String s = "";

            String temp = "";
            while(str.charAt(i) != '#') temp += str.charAt(i++);

            int len = Integer.parseInt(temp);

            i++;

            int end = i + len;

            while(i < end) s += str.charAt(i++);

            ans.add(s);
        }

        return ans;
    }
}
