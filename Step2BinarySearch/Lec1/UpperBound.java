package Step2BinarySearch.Lec1;

public class UpperBound {
    public static int lowerbound(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 9, 10, 13, 19 };
        int target = 13;

        int result = lowerbound(arr, target);
        System.out.println("Upper bound is found at index: " + result);
    }
}
//tc = 0(log n)
//sc = 0(1)