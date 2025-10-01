package Step2BinarySearch;

public class BinarySearch {
    public static int binarySearch(int arr[], int target) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 13, 17, 19 };
        int target = 6;
        int result = binarySearch(arr, target);
        System.out.println("Element " + target + " is found at index " + result);
    }
}
