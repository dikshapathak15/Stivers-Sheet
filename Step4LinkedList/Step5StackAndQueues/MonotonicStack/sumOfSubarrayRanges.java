public class sumOfSubarrayRanges{
   public static int sum(int[] sum){
    int n = sum.length;
    int totalSum = 0;

    for(int i = 0 ; i < n ; i++){
            int largest = sum[i];
            int smallest = sum[i];
            for(int j = i + 1; j < n ; j++){
                largest = Math.max(largest, sum[j]);
                smallest = Math.min(smallest, sum[j]);

                totalSum += largest - smallest;
            }
    }
    return totalSum;
   }
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        int sum = sum(arr);
        System.out.println(sum);
    }
}

//tc = 0(n^2) since we are using two nested loops
//sc = 0(1) since we are using only couple of variables