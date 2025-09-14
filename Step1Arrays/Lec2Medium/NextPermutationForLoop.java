package Step1Arrays.Lec2Medium;

import java.util.*;

public class NextPermutationForLoop {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i;

        // Step 1: Find the pivot (first decreasing element from right)
        for (i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }

        if (i == -1) {
            // Case: array is descending, just reverse it to smallest permutation
            reverse(nums, 0, n - 1);
            return;
        }
        

        if (i >= 0) {
            // Step 2: Find rightmost element greater than nums[i]
            int j;
            for (j = n - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    break;
                }
            }
            // Step 3: Swap
            swap(nums, i, j);
        }

        // Step 4: Reverse suffix from i+1 to end
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        for (int left = start, right = end; left < right; left++, right--) {
            swap(nums, left, right);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        nextPermutation(nums1);
        System.out.println(Arrays.toString(nums1)); // [1, 3, 2]

        int[] nums2 = { 3, 2, 1 };
        nextPermutation(nums2);
        System.out.println(Arrays.toString(nums2)); // [1, 2, 3]

        int[] nums3 = { 1, 1, 5 };
        nextPermutation(nums3);
        System.out.println(Arrays.toString(nums3)); // [1, 5, 1]
    }
}
