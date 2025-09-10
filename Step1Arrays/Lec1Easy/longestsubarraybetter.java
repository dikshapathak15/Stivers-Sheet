package Step1Arrays.Lec1Easy;

import java.util.HashMap;
import java.util.Map;

public class longestsubarraybetter {
     public static int longestSubarrayWithSumK(int[] a, int k) {
        // Map to store prefix sum -> earliest index
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            // Case 1: subarray starts from index 0
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Case 2: subarray in between
            long rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Store prefix sum if not already present
            preSumMap.putIfAbsent(sum, i);  //“Insert (sum, i) into the map only if sum is not already present.”
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;

        System.out.println("Longest subarray length = " + longestSubarrayWithSumK(arr, k));
    }
}
