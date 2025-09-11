package Step1Arrays.Lec2Medium;

import java.util.Arrays;

public class Sort012byDNF {
    public static int[] sortArr(int arr[]) {
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap arr[mid] and arr[low]
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {// arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 2, 1, 2, 2, 1, 0, 0, 0, 2, 1, 1 };
        int result[] = sortArr(arr);
        System.out.println(Arrays.toString(result));
    }
}
//tc = (n)
//sc = 0(1)