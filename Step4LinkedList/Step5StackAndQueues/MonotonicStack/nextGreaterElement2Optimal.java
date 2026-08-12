package MonotonicStack;

import java.util.Stack;

public class nextGreaterElement2Optimal {
     public static int[] nextGreaterEleOptimal(int[] nums){
        Stack<Integer> st = new Stack<>();
        int n = nums.length;

        int[] nge = new int[n];

        for(int i = ((2*n) -1 ); i >= 0 ; i--){
            int ind = i % n;
            while (!st.isEmpty() && st.peek() <= nums[ind]) {       //poping out equal and smaller element
                st.pop();
            }

            if(i < n){   
            if (st.isEmpty()) {
                nge[ind] = -1;
            }else{
                nge[ind] = st.peek();
            }
        }

            st.push(nums[ind]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] nums = {4,12,2,10,11};
        int[] ans = nextGreaterEleOptimal(nums);

        for(int x: ans){
            System.out.println(x + " ");
        }
        System.out.println();
    }
}

//tc = 0(n)
//sc = 0(n)
