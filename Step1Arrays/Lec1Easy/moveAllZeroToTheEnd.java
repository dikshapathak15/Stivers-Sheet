package Step1Arrays.Lec1Easy;

public class moveAllZeroToTheEnd {
    public static int[] moveAllZerotoTheEnd(int arr[]) {

        // putting all non-zero elements into temp arr
        int temp[] = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[count] = arr[i];
                count++;
            }
        }
        // putting elements of temp arr in front of the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        // assigning remaining place with 0
        int noOfNonZero = temp.length;
        for (int i = noOfNonZero; i < arr.length; i++) {
            arr[i] = 0;
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

//TC = 0(n)+0(x)+0(n-x) = 0(2n)
//SC = 0(x) extra space;
//SC = 0(N) worst case
