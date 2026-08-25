import java.util.Stack;
public class removeKDigits{

    public static String removeKDigits(String nums, int k){
        Stack<Character> st = new Stack();

        for(int i = 0 ; i < nums.length(); i++){
            char digit = nums.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > digit) {
                st.pop();
                k--;
            }

            st.push(digit);
        }

        while (k>0) {
            st.pop();
            k--;
        }

        if (st.isEmpty()) {
            return "0";
        }

        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        while (res.length() > 0 && res.charAt(res.length() - 1) == 0) {
            res.deleteCharAt(res.length() - 1);
        }

        res.reverse();

        if (res.length() == 0) {
            return "0";
        }

        return res.toString();
    }
    public static void main(String[] args) {
        String nums = "1432219";
        int k = 3;
        String res = removeKDigits(nums, k);
        System.out.println("Trimmed string is: " + res);
    }
}

//tc - 0(n) for traversing the string and pushing it onto the stack +
//0(k) - for removing the remaining ele(if k > 0) which can be 0(n) in worst case
// 0(n) - forming the res trimming the zero and reversing it can take 0(n)