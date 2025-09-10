package Step1Arrays.Lec1Easy;

public class longestsubarraywithsumk {
    public static int longestsubarraywithsumk(int arr[] , int k){
        int maxLength = 0;
        int n = arr.length;
        for(int i = 0 ; i< n;i++){
            int sum = 0;
            for(int j = i; j <n ; j++){
                sum = sum + arr[j];
                if(sum == k){
                    maxLength = Math.max(maxLength, j-i + 1);
                }
            }
        }
        return maxLength;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,0,1,1,0};
        int k=3;
        System.out.println("The longest subarray with sum " + k + " is: " + longestsubarraywithsumk(arr,k));
    }
}
//tc = 0(n^2)
//sc = 0(1)
