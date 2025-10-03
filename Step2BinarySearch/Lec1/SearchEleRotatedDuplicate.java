package Step2BinarySearch.Lec1;

public class SearchEleRotatedDuplicate {
    public static int searchEle(int[] arr,int target){
          int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = (low+ high)/2;

            if(arr[mid] == target) return mid;

            //contains duplicate
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low = low +1;
                high = high - 1;
                continue;
            }

            //left sorted
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid]){
                    high = mid -1;
                }else{
                    low = mid + 1;
                }
            }else{     //right sorted
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
        int arr[] = {3,3,0,1,3,3,3};
        int target = 1;
        int result = searchEle(arr,target);
        System.out.println("Element found at index: " + result);
    }
}
//tc =0(log n) and in the worst case 0(n/2)
//sc = 0(1)