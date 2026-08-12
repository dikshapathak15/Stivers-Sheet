package MonotonicStack;
import java.util.Stack;

public class nextGreaterEleOptimal {

    public static int[] nextGreaterEleOptimal(int[] nums){
        Stack<Integer> st = new Stack<>();
        int n = nums.length;

        int[] nge = new int[n];

        for(int i = n -1 ; i >= 0 ; i--){
            while (!st.isEmpty() && st.peek() <= nums[i]) {       //poping out equal and smaller element
                st.pop();
            }

            if (st.isEmpty()) {
                nge[i] = -1;
            }else{
                nge[i] = st.peek();
            }

            st.push(nums[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,2,10};
        int[] ans = nextGreaterEleOptimal(nums);

        for(int x: ans){
            System.out.println(x + " ");
        }
        System.out.println();
    }
}


//tc = 0(n) and sc = 0(n)