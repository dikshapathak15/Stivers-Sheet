

import java.util.*;

public class unionOptimal {
    public static List<Integer> unionOfArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr1.length;
        int i = 0, j = 0;

        List<Integer> union = new ArrayList<>();

        while (i < n && j < m) {// skip duplicates in arr1 and arr2
            while (i > 0 && i < n && arr1[i] == arr1[i - 1]) {
                i++;
            }
            while (j > 0 && j < m && arr2[j] == arr2[j - 1]) {
                j++;
            }

            if (i >= n || j >= m) // when array ends
                break;

            if (arr1[i] < arr2[j]) { // prints the smaller one arr1[i]
                union.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                union.add(arr2[j]);
                j++;
            } else { // both are equal
                union.add(arr1[i]);
                i++;
                j++;
            }

            // Add remaining elements of arr1
            while (i < n) {
                if (i == 0 || arr1[i] != arr1[i - 1]) {
                    union.add(arr1[i]);
                }
                i++;
            }

            // Add remaining elements of arr2
            while (j < m) {
                if (j == 0 || arr2[j] != arr2[j - 1]) {
                    union.add(arr2[j]);
                }
                j++;
            }

        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 5, 6, 7 };

        List<Integer> result = unionOfArrays(arr1, arr2);
        System.out.println("Union of arrays: " + result);
    }
}

//TC= 0(n1+n2)
//SC= 0(1) but for returning the answer 0(n1+n2)