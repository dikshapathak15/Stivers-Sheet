package Step1Arrays.Lec2Medium;

public class SubarraywithmaxSum {
    public static void maxSubarray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            // update maxSum if needed
            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            // reset if currSum goes negative
            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
        System.out.print("Subarray = [");
        for (int j = start; j <= end; j++) {
            System.out.print(arr[j] + (j < end ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maxSubarray(arr);
    }
}
