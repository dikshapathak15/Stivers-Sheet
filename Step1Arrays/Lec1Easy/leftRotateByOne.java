

public class leftRotateByOne {
    public static int[] leftRotatebyOne(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        arr = leftRotatebyOne(arr);

        // Print rotated array
        for (int num : arr) { // take each element from the array arr and store it in the variable num then
                              // run the loop body for that num
            System.out.print(num + " ");
        }
    }
}


//TC = 0(n)
//SC = 0(1)