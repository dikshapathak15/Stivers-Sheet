

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Sum3Optimal {
    public static List<List<Integer>> sum3(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();
        for( int i =0 ; i < n ; i++){
            //skip duplicate values for i
            if(i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i+1 , right = n-1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];

                if(sum == 0){
                    result.add(Arrays.asList(arr[i] , arr[left] , arr[right]));

                    //skip duplicats for left and right
                    while(left < right && arr[left] == arr[left + 1]) left++;
                    while(left < right && arr[right] == arr[right - 1]) right--;

                    left++;
                    right--;
                }else if(sum < 0){
                    left ++; //need bigger sum
                }else{
                    right--; // need smaller sum
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = sum3(arr);
        System.out.println(result);
    }
}
//tc = 0(n^2)
//sc= 0(1)