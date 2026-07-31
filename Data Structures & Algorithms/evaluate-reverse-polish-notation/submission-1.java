class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st = new Stack<>();
        String Operators = "+-*/";
         int result = 0;

        for(String token:tokens){
           if(Operators.indexOf(token)!= -1){
            int d2 = st.pop();
            int d1 = st.pop();

            if(token.equals("+"))
                result = d1+d2;
            else if(token.equals("-"))
                result = d1-d2;
            else if(token.equals("*"))
                result = d1*d2;
            else if(token.equals("/"))
                result = d1/d2;

            st.push(result);
           }
        else{
            st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}
