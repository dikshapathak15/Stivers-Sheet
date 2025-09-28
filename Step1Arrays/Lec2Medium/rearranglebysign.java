

import java.util.Arrays;

public class rearranglebysign {
    public static int[] rearranglebySign(int[] arr) {
        int n = arr.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];

        int p = 0, q = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos[p++] = arr[i];
            } else {
                neg[q++] = arr[i];
            }
        }
        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = pos[i];
            arr[2 * i + 1] = neg[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 3, -4 };
        int[] result = rearranglebySign(arr);
        System.out.println(Arrays.toString(result));
    }
}
// tc = 0(n) +0(n) =0(n)
// sc = 0(n)