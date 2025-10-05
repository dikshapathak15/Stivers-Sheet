package Step2BinarySearch;

public class peakElement {
    public static int peakEle(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(n == 1) return i;
            if(i == 0 && arr[i] > arr[i +1]) return i; // handles first element
            if(i == n-1 && arr[i] > arr[i-1]) return i;//handles last element
            if(i>0 && i<n-1 && arr[i] > arr[i-1] && arr[i] > arr[i+1]) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,6,9};
        System.out.println("The peak element is at index: " + peakEle(arr));
    }
}
