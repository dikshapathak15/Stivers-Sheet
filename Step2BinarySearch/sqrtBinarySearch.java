package Step2BinarySearch;

public class sqrtBinarySearch {
    public static int sqrtNum(int target){
        int low = 1 , high = target, ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(mid*mid == target) return mid;
            if(mid*mid < target){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int target = 37;
        System.out.println("The square root of " + target + " is: " + sqrtNum(target));
    }
}
//tc = 0(log n)