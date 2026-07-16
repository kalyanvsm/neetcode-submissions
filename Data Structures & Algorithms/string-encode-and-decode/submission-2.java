class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        int n = str.length();

        List<String> arr = new ArrayList<>();

        int i = 0;
        while(i < n){
            int j = i;
            while (str.charAt(j) != '#') j++;

            int strLen = Integer.parseInt(str.substring(i, j));
            i = j + 1;

            arr.add(str.substring(i, i + strLen));
            i += strLen;
        }

        return arr;
    }
}
