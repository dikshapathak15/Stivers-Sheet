

public class missingnumoptimalxor {
      public static int findMissing(int[] arr) {
        int n = arr.length + 1; // since one number is missing

        int xor1 = 0; // XOR of 1..n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;                   //1^2^3^4^5^6
        }

        int xor2 = 0; // XOR of array elements
        for (int num : arr) {
            xor2 ^= num;                //1^2^4^5^6
        }

        // Missing number is XOR of above two
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing 3
        System.out.println("Missing Number: " + findMissing(arr));
    }
}
// TC = 0(n) 
// Tc = o(1)
