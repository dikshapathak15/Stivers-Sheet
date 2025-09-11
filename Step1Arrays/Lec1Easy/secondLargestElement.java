

public class secondLargestElement {
    public static int secondLargestElemnt(int[] nums) {
        int largest = nums[0];
        int secondLargest = -1; // take Integer.MIN_VALUE if array contain negative element
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                // update secondLargest before changing largest
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 7, 3, 2, 9 };
        System.out.print("The second largest element is " + secondLargestElemnt(nums));
    }
}


//TC = 0(n)
//SC = 0(1)
