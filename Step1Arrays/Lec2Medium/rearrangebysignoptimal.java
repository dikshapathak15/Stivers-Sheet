

import java.util.Arrays;

public class rearrangebysignoptimal {
    public static int[] rearrangebySignOptimal(int[] arr){
        int n = arr.length;
        int ans[] = new int[n];
        int posIndex = 0 , negIndex = 1;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] < 0){
                ans[negIndex] = arr[i];
                negIndex += 2;
            }else{
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 3, -4 };
        int[] result = rearrangebySignOptimal(arr);
        System.out.println(Arrays.toString(result));
    }
}

//tc = 0(n)
//sc = 0(n)
