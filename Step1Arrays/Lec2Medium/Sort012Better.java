package Step1Arrays.Lec2Medium;

import java.util.Arrays;

public class Sort012Better {
    public static int[] sortArr(int[] arr) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        // Count 0s, 1s and 2s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                cnt0++;
            else if (arr[i] == 1)
                cnt1++;
            else
                cnt2++;
        }

        for (int i = 0; i < cnt0; i++) {
            arr[i] = 0;
        }
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            arr[i] = 1;
        }
        for (int i = cnt0 + cnt1; i < arr.length; i++) {
            arr[i] = 2;
        }

        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 2, 1, 2, 0, 0, 1, 2 };
        System.out.println(Arrays.toString(sortArr(arr)));
    }
}
//tc = 0(2n)
//sc= 0(1)