class Solution {
    public String simplifyPath(String path) {
        String[] p = path.split("/");
        
        Stack<String> st = new Stack<>();

        for(String s : p){
            if(s.equals("/") || s.equals(".") || s.equals(" ") || s.equals("")) continue;
            else if(s.equals("..")){
                if(!st.isEmpty()) st.pop();
            }
            else st.push(s);
        }
        
        String s = "";
        while(!st.isEmpty()) s = "/" + st.pop() + s;
        
        if(s.length() == 0) return "/";
        return s;
    }
}