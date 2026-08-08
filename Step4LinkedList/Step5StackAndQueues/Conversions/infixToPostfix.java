package Conversions;

import java.util.Stack;

public class infixToPostfix{

    public static int precedence(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '/' || ch == '*') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return -1;
        }
    }

    public static void infixToPostFix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {  //operands are added to answer
                 answer.append(ch);
            }else if(ch == '('){                 // opening bracted added to stack
                st.push(ch);
            }else if (ch == ')') {               // pop out all operators and add to anwer until opening bracket is encountered
                while (st.peek() == '(') {
                    answer.append(st.pop());
                }
            }else{
                if (!st.isEmpty() && precedence(ch) <= precedence(st.peek())) {
                    answer.append(st.pop());
                }

                st.push(ch);

            }

        }

            while (!st.isEmpty()) {
              answer.append(st.pop());
            }

            System.out.println("Postfix expression: " + answer.toString());

        
    }
  

     public static void main(String[] args) {
        String exp = "a+b*(c^d-e)";
        System.out.println("Infix expression: " + exp);
        infixToPostfix.infixToPostFix(exp);
    
  }

}


//tc = 0(n) each character in the string processed once
//sc = 0(n) stack can hold at,ost n operators and paranthesis in worst condition
