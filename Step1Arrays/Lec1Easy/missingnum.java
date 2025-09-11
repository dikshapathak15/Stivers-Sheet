

public class missingnum {
     public static int findMissing(int[] arr) {
        int n = arr.length + 1; // because one number is missing
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i; // missing number found
            }
        }
        return -1; // should never reach here
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing 3
        System.out.println("Missing Number: " + findMissing(arr));
    }
}
//TC= 0(n*n) hypothetical
//Sc= 0(1)
