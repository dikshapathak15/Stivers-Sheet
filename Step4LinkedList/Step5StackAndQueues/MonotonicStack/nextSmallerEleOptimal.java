import java.util.Arrays;
import java.util.Stack;

public class nextSmallerEleOptimal {

    public static int[] nextSmallestElementOptimal(int[] arr){

        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>();

        for(int i = n-1 ; i >= 0 ; i--){

            while(!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return ans;

    }

    public static void main(String[] args) {
         int[] arr = {1, 3, 4, 0, 9, 7,2};
        int[] ans = nextSmallestElementOptimal(arr);

        for(int i = 0 ; i < ans.length; i++){
            System.out.println(ans[i]);
        }
        System.out.println();
     }

    }

    //tc = 0(n)
    //sc = 0(n)