package Step1Arrays.Lec2Medium;

public class MasxSubSum {
    public static int maxSubSum(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i ++){
            for(int j = 0 ; j< arr.length ; j++){
                int sum = 0;
                for(int k = i ; k<= j ; k ++){
                    sum += arr[k];
                    max = Math.max(sum , max);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubSum(arr));
    }
}
//tc equivalent to 0(n^3)
//sc = 0(1)
