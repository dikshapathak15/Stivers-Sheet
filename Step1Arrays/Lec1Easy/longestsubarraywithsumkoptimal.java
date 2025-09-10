package Step1Arrays.Lec1Easy;

public class longestsubarraywithsumkoptimal {
    public static int longestsubarraywithsumkoptimal(int[] arr, long k) {
        int n = arr.length;
        int sum = arr[0];
        int right = 0, left = 0;
        int maxLen = 0;

        while (right < n) {

            // shrink window until sum <=k
            while (left <= right && sum > k) {
                sum = sum - arr[left];
                left++;
            }

            // check if sum == k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            //expand window
            right++;
            if(right<n){
                sum = sum + arr[right];
            }
        }
        return maxLen;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 1, 1, 3, 2, 1 };
        long k = 3;
        System.out.println("The longest subarray with sum: " + k + " is " + longestsubarraywithsumkoptimal(arr, k));
    }
}
