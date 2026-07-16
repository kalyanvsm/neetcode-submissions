class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        
        for(String s : operations){
            if(s.equals("+")){
                int n1 = st.pop();
                int sum = st.peek() + n1;
                st.push(n1);
                st.push(sum);
            }else if(s.equals("C")) st.pop();
            else if(s.equals("D")) st.push(2 * st.peek());
            else{
                st.push(Integer.parseInt(s));
            }
        }

        int ans = 0;
        while(!st.isEmpty()) ans += st.pop();

        return ans;
    }
}