package Step2BinarySearch;

public class Floor {
    public static int floor(int[] arr , int target){
        int n= arr.length;
        int low = 0, high = n-1;
        int ans = n;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] <= target){
                ans = arr[mid];
               low = mid + 1; 
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,8,10,13};
        int target = 12;
        int result = floor(arr,target);
        System.out.println("Floor of the element is: " + result);
    }
}
//tc = 0(log n)
//sc = 0(1)
