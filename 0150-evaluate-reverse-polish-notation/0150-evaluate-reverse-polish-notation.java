class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            String tok = tokens[i];
            if(tok.equals("+") || tok.equals("-") || 
                tok.equals("*") || tok.equals("/"))
            {
                int b = st.pop();
                int a = st.pop();

                if(tok.equals("+"))
                {
                    st.push(a+b);
                }else if(tok.equals("-"))
                {
                    st.push(a-b);
                }else if(tok.equals("*"))
                {
                    st.push(a*b);
                }else{
                    st.push(a/b);
                }
            }
            else
            {
                st.push(Integer.parseInt(tok));
            }
        }

        return st.pop();
    }
}
