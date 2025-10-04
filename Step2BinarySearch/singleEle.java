package Step2BinarySearch;

public class singleEle {
    public static int singleElement(int arr[]) {
        int n = arr.length;

        // Edge cases
        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

        // Middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }

        return -1; // if no single element found
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println("Single element in the array is: " + singleElement(arr));
    }
}
//tc = 0(n)
//sc = 0(1)
