package Step1Arrays.Lec1Easy;

import java.util.*;

public class appearbetter {
     public static int appearance(int arr[]) {
        // Step 1: Find max element
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Step 2: Create hash array
        int[] hash = new int[max + 1];

        // Step 3: Count frequencies
        for (int num : arr) {
            hash[num]++;
        }

        // Step 4: Find the element that appears once
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 1) {
                return i;
            }
        }

        return -1; // if no unique element found
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        System.out.println("The num which appears once is: " + appearance(arr));
    }
}
