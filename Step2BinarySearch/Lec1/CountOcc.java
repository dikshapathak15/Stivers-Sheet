package Step2BinarySearch.Lec1;

public class CountOcc {
     public static int firstOcc(int[] arr, int target){
        int first = -1;
        int low = 0 , high = arr.length - 1;

        while( low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == target){
                first = mid;
                high = mid - 1;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return first;
    }

    public static int lastOcc(int[] arr, int target){
        int last = -1;
        int low = 0 , high = arr.length - 1;

        while( low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == target){
                last = mid;
                low = mid + 1;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return last;
    }
    public static int countOcc(int[] arr , int target){
        int first = firstOcc(arr, target);
        if (first == -1) return -1;
        int last = lastOcc(arr, target);
        return (last - first + 1);
    }
 
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,5,5,6,7,9};
        int target = 5;

        int count = countOcc(arr,target);

        System.out.println("Count of " + target + " is " + count);
    }
}
//tc = 0(log n)
//sc = 0(1)
