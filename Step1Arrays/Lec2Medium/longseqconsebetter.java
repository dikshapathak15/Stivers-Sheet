package Step1Arrays.Lec2Medium;

import java.util.Arrays;

public class longseqconsebetter {
    public static int longseqconsecutive(int[] arr) {
        int longest = 1;
        int cntCurr = 0;
        int lastSmallest = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 == lastSmallest) {
                cntCurr++;
                lastSmallest = arr[i];
            } else if (lastSmallest != arr[i]) {
                cntCurr = 1;
                lastSmallest = arr[i];
            }
            longest = Math.max(longest, cntCurr);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
        System.out.println(longseqconsecutive(arr));
    }
}
// tc = 0(n log n)
// sc = 0(1)
