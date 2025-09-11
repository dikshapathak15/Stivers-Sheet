

import java.util.*;

public class unionBrute {
    public static int[] union(int arr1[], int arr2[]) {
        // using hashset to store unique elements
        Set<Integer> set = new HashSet<>();

        // add all element from arr1
        for (int num : arr1) {
            set.add(num);
        }
        // add all element from arr2
        for (int num : arr2) {
            set.add(num);
        }
        // convert set to array
        int result[] = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 3, 4, 5, 6 };

        int[] result = union(arr1, arr2);

        System.out.print("Union: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

//TC= 0(n1logn) + 0(n2logn) +0(n1+n2)
//SC= 0(n1+n2) + 0(n1+n2)
