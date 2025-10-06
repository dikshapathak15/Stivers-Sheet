package Step2BinarySearch;

public class SqrtNumber {
    public static int sqrtNum(int[] arr,int target){
        int ans = 0;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] * arr[i] <= target){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        int target = 28;
        System.out.println("The squarerrot of the number is: " + sqrtNum(arr));
    }
}
