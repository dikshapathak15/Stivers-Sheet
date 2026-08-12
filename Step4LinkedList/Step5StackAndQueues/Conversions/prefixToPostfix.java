package Conversions;

import java.util.Stack;

public class prefixToPostfix {
     public static String preFixToPostFix(String postFix){
        Stack<String> st = new Stack<>();
        int n = postFix.length(); 

        for(int i = n-1 ; i >= 0; i--){
            char ch = postFix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }else{
                String op1 = st.pop();
                String op2 = st.pop();

                st.push(  op1 + op2 + ch );
            }
        }
        return st.peek();
    }


    public static void main(String[] args) {
         String exp = "*-A/BC-/AKL";
        System.out.println("Prefix expression: " + exp);
        System.out.println(prefixToPostfix.preFixToPostFix(exp));
    }
}
