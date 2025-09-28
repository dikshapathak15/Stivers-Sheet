

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3Better {
    public static List<List<Integer>> sum3(int[] arr){
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0 ; i < n ; i ++){
            Set<Integer> hashset = new HashSet<>();
            for(int j = i+1 ; j <n ;  j++){
                int third = -(arr[i] + arr[j]);
                if(hashset.contains(third)){
                    List<Integer> temp = new ArrayList<>(Arrays.asList(arr[i], arr[j] , third));
                    Collections.sort(temp);
                    set.add(temp);
                }
                hashset.add(arr[j]);
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = sum3(arr);
        System.out.println(result);
    }
}
//tc = 0(n^2)
//sc = 0(n^2) hashset stores at most O(n) elements per iteration of i.In the worst case, the number of unique triplets can be O(n²)
