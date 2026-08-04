import java.util.Stack;


public class balanceParantheses {
    public static boolean checkParantheses(String s){
        Stack<Character> st = new Stack();
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }else{
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.peek();
                if ((ch == ')' && top == '(' ) || (ch == '}' && top == '{' ) || (ch == ']' && top == '[' )) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(checkParantheses("{[()]}"));
    }
}

//tc and sc = 0(n)