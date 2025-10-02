package Step2BinarySearch;

public class SearchElementInRotatedArray {
    public static int searchEle(int[] arr, int target){
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = (low+ high)/2;

            if(arr[mid] == target) return mid;

            //left sorted
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid]){
                    high = mid -1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid + 1;
                }else{
                    high = high - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        int target = 1;

        int result = searchEle(arr,target);
        System.out.println("Element found at index: " + result);
    }
}
//tc = 0(log n)
//sc = 0(1)
