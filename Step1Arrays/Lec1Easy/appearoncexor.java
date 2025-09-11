

public class appearoncexor {
     public static int appearance(int arr[]) {
        int xor = 0;

        for (int num : arr) {
            xor ^= num; // XOR all elements
        }

        return xor; // the unique number remains
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        System.out.println("The num which appears once is: " + appearance(arr));
    }
}
//tc = 0(n)
//sc= 0(1)