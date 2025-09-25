package Step1Arrays.Lec2Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3Brute {
    public static Set<List<Integer>> sum3(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k]));
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        return set;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        Set<List<Integer>> result = sum3(arr);
        System.out.println(result);
    }
}
