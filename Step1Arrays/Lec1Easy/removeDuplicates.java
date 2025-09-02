package Step1Arrays.Lec1Easy;

import java.util.Arrays;

public class removeDuplicates {
  public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0;  // slow pointer
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1; // new length of unique array
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);
        System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
}

//TC = 0(n)
//SC = 0(1)