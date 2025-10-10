package Step2BinarySearch;

public class MinDivisor {
    public static int minDiv(int[] arr, int threshold){
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int num : arr){
            high = Math.max(high, num);
        }
        int ans = high;
        while(low <= high){
            int mid = (low + high)/2;
            int sum = sumDiv(arr, mid);
            if(sum <= threshold){
                ans =  mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int sumDiv(int[] arr , int divisor){
        int sum = 0;
        for(int i = 0 ; i <= arr.length-1 ; i ++){
            sum += (arr[i] + divisor - 1)/ divisor;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int threshold = 6;
        System.out.println("The min divisor that holds the threshold value is: " + minDiv(arr,threshold));
    }
}
