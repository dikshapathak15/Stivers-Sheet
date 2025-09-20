package Step1Arrays.Lec2Medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class leadereleoptimal {
    public static List<Integer> leaderElement(int[] arr){
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = n-1; i >= 0; i--){
            if(arr[i]> max){
                ans.add(arr[i]);
            }
            max = Math.max(max, arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        List<Integer> result = leaderElement(arr);
        System.out.println("The leader elements are: " + result);
    }
}
