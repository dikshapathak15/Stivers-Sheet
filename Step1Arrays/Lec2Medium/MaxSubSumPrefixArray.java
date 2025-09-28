

public class MaxSubSumPrefixArray {
    public static int maxSubSum(int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        //Calculate prefix array
        for(int i = 1; i < arr.length ; i ++){
            prefix[i] = prefix[i-1] + arr[i];
        } 

        for(int i = 0; i < arr.length ; i ++){
            for(int j = i ; j < arr.length ; j ++){
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                 max = Math.max(sum, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(maxSubSum(arr));
    }
}
//tc = 0(n^2)
//sc =  0(n) for prefix array
