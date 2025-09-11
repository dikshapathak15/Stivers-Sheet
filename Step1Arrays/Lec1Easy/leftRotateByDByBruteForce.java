

import java.util.Scanner;

public class leftRotateByDByBruteForce {
    public static int[] leftRotateByDbyBruteForce(int arr[], int d) {
        int n = arr.length;
        d = (d > n) ? d = d % n : d;

        // storing the value in temp arr
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = (arr[i]);
        }
        // now rotating the values to left by d
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        // now putting the values from the temp arr into the array
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number by which you want to left rotate the array: ");
        int d = sc.nextInt();

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        arr = leftRotateByDbyBruteForce(arr, d);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


//TC = 0(d) + 0(n-d)+ 0(d) = 0(n+d) 
//SC = 0(d) extra space for storing temp array
