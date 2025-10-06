package Step2BinarySearch;

public class SqrtNumber {
    public static int sqrtNum(int target) {
        int ans = 0;
        for (int i = 1; i * i <= target; i++) {
            ans = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int target = 37;
        System.out.println("The square root of " + target + " is: " + sqrtNum(target));
    }
}
//tc = 0(n)
