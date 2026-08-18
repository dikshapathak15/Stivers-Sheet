

import java.util.Arrays;

public class nextGreayerElement2 {
    public static int[] nextGreaterEle(int[] nums){
        
        int n = nums.length;
        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        for(int i = 0 ; i < n ; i++){
            for(int j =1; j < n ; j++){
                int index = (i + j) % n;
                if (nums[index] > nums[i]) {
                    ans[i] = nums[index];
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,12,2,10};
        int[] ans = nextGreaterEle(nums);

        for(int x: ans){
            System.out.println(x + " ");
        }
        System.out.println();
    }
}

//tc = 0(n^2) and sc = 0(n)