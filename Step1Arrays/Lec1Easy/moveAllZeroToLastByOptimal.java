package Step1Arrays.Lec1Easy;

public class moveAllZeroToLastByOptimal {
    public static int[] moveAllZerotoTheEnd(int arr[]) {
        // finding and placing the j pointer to the null element
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        // swapping the non zero element with zero
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 0, 0, 5, 6, 0, 7, 8 };
        arr = moveAllZerotoTheEnd(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// TC = 0(x) + 0(n-x) = 0(n)
// SC = 0(1)