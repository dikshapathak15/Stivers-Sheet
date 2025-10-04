package Step2BinarySearch;

public class LowerBound {
    public static int lowerbound(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
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
        int target = 12;

        int result = lowerbound(arr, target);
        System.out.println("Lower bound is found at index: " + result);
    }
}
// tc = 0(log n)
// sc = 0(1)
// lower bound code is similiar to the search insert position code because it
// returns the index value where thr element which is not present in the index
// can be inserted
// ceiling problem is also same as the lower bound