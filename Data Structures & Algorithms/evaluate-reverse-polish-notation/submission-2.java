class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String s : tokens){
            if(s.equals("+")){
                int sum = st.pop() + st.pop();
                st.push(sum);
            }else if(s.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b - a);
            }else if(s.equals("*")){
                int product = st.pop() * st.pop();
                st.push(product);
            }else if(s.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b / a);
            }else{
                st.push(Integer.parseInt(s));
            }
        }

        return st.peek();
    }
}
