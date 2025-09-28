

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class Sum2var2butnotoptimal {
    public static int[] twoSum(int n, List<Integer> book , int target){
        Collections.sort(book);
        int left=0 , right = n-1;
        while(left<right){
            int sum = book.get(left) + book.get(right);
            if(sum == target){
                return new int[]{left,right};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
      List<Integer> book = Arrays.asList(10,20,30,40,50);
        int target = 70;

        int result[] = twoSum(book.size(),book,target);
      
        System.out.println("Indices are" + result[0] + "," + result[1]);

    }
}
//tc = 0(n) + 0(nlogn)
//sc= 0(1) and 0(n) when we consider distorded array