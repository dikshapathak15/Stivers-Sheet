
import java.util.Arrays;


public class nextGreaterElement {

    public static int[] nextGreaterEle(int[] nums){
        
        int n = nums.length;
        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1; j < n ; j++){
                if (nums[j] > nums[i]) {
                    ans[i] = nums[j];
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,2,10};
        int[] ans = nextGreaterEle(nums);

        for(int x: ans){
            System.out.println(x + " ");
        }
        System.out.println();
    }
}

//tc = 0(n^2)
//sc = 0(n) -> for storing ans arr