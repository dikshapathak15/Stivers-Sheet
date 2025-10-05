package Step2BinarySearch;

public class singleEleoptimal {
    public static int singleEle(int[] arr){
        int n = arr.length;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];

        int low = 1, high = n-2;
        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] != arr[mid -1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }

            //elimination(even,odd)
            if(mid % 2 == 0 && arr[mid] == arr[mid+1] || mid % 2 == 1 && arr[mid] == arr[mid-1]){
                low = mid + 1; //eliminate left half because element is present on right half
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,4,5,5,6,6,7,7};
        System.out.println("The single element is : " + singleEle(arr));
    }
}
//tc = 0(log n)