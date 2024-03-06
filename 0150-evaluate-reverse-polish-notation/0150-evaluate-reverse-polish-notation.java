import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                int res = operator(a, b, token);
                st.push(res);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }

    public int operator(int a, int b, String token) {
        if (token.equals("+")) {
            return a + b;
        }
        if (token.equals("-")) {
            return a - b;
        }
        if (token.equals("*")) {
            return a * b;
        }
        if (token.equals("/")) {
            return a / b;
        }
        return 0;
    }
}
