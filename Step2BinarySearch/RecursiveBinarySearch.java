package Step2BinarySearch;

public class RecursiveBinarySearch {
    public static int recBinSearch(int arr[], int low, int high, int target) {
        if (low > high) {
            return -1; // base case
        }
        int mid = (low + high) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target) {
            return recBinSearch(arr, low, mid - 1, target);
        } else {
            return recBinSearch(arr, mid + 1, high, target);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 13, 19 };
        int target = 13;
        int low = 0, high = arr.length - 1;

        int result = recBinSearch(arr, low, high, target);

        if (result != 1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
//tc = 0(log n)
//sc = 0(1)
