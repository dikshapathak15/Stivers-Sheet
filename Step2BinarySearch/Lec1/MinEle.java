package Step2BinarySearch.Lec1;

public class MinEle {
    public static int minEle(int[] arr){
        int low = 0, high = arr.length - 1;
        int min = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low + high)/2;

            //whole array is sorted
            if(arr[low] <= arr[high]){
                min = Math.min(arr[low] , min);
                break;
            }
            //left sorted
            if(arr[low] <= arr[mid]){
                min = Math.min(arr[low] , min);
                low = mid + 1;
            }else{   //right sorted
                min = Math.min(arr[mid], min);
                high = mid - 1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = { 7, 8, 0, 1, 2, 3, 4, 5, 6 };
        int result = minEle(arr);
        System.out.println("The minimum element in the given array is: " + result);
    }
}
//tc = 0(log n)
//sc = 0(1)
