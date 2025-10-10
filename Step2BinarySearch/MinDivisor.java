package Step2BinarySearch;

public class MinDivisor {
     public static int minDiv(int[] arr, int threshold){
       int max = Integer.MIN_VALUE;

       for(int num : arr){
        max = Math.max(max, num);
       }
       for(int divisor = 1 ; divisor <= max ; divisor++ ){
        if(sumDiv(arr, divisor) <= threshold){
            return divisor;
        }
       }
       return -1;
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
//tc = 0(n* max(arr))