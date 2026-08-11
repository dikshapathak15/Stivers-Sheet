package Conversions;

import java.util.Stack;

public class postFixToInfix {

    public static String postFixToInFix(String postFix){
        Stack<String> st = new Stack<>();

        for(int i = 0 ; i < postFix.length(); i++){
            char ch = postFix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }else{
                String op1 = st.pop();
                String op2 = st.pop();

                st.push("(" + op2 + ch + op1 + ")");
            }
        }
        return st.peek();
    }


    public static void main(String[] args) {
         String exp = "AB*C+";
        System.out.println("Postfix expression: " + exp);
        System.out.println(postFixToInfix.postFixToInFix(exp));
    }
}
