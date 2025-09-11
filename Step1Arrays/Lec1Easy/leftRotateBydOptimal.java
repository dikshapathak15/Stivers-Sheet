

import java.util.Scanner;

public class leftRotateBydOptimal {

    public static void Reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] leftRotateByDbyOptimal(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        Reverse(arr, 0, d-1);
        Reverse(arr, d, n-1);
        Reverse(arr, 0, n-1);
        return arr;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number by which you want to left rotate the array: ");
        int d = sc.nextInt();

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        arr = leftRotateByDbyOptimal(arr, d);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

//TC = 0(2n) slightly increased than brute force
//SC = 0(1)
