

import java.util.*;

public class intersection {
    public static List<Integer> intersection(int arr1[], int arr2[]) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[arr2.length]; //new array of boolean type

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !visited[j]) {
                    result.add(arr1[i]);
                    visited[j] = true;
                    break;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 3, 4, 5, 6 };

        
        List<Integer> result = intersection(arr1, arr2);
        System.out.println("Intersection of arrays: " + result);
    }
}
// TC= 0(n1*n2)
// Sc= 0(n2)
