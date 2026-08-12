package Conversions;

import java.util.Stack;

public class postFixToPrefix {
    public static String postFixToPreFix(String postfix){

        Stack<String> st = new Stack<>();
        int n = postfix.length();

        for(int i = 0 ; i < n ; i ++){
            char ch = postfix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }else{
                String op2 = st.pop();
                String op1 = st.pop();

                st.push(ch + op1 + op2);
            }
        }

        return st.peek();
    }

    public static void main(String[] args) {
        String exp = "ABC/-AK/L-*";
        System.out.println("Postfix expression: " + exp);
        System.out.println("Prefix expression: " + postFixToPrefix.postFixToPreFix(exp));
    }
}
