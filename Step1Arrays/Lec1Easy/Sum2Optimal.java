package Step1Arrays.Lec1Easy;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class Sum2Optimal {
    public static String twoSum(int n, List<Integer> book , int target){
        Collections.sort(book);
        int left=0 , right = n-1;
        while(left<right){
            int sum = book.get(left) + book.get(right);
            if(sum == target){
                return "YES";
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
      List<Integer> book = Arrays.asList(10,20,30,40,50);
        int target = 70;
      
        System.out.println(twoSum(book.size(),book,target));

    }
}
//tc = 0(n) + 0(nlogn)
//sc= 0(1) and 0(n) when we consider distorded array