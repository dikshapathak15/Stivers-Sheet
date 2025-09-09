package Step1Arrays.Lec1Easy;

public class missingnumhashing {
    public static int findMissing(int[] arr) {
        int n = arr.length + 1; // one number is missing

        // Create hash array
        int[] hash = new int[n + 1]; // index from 0..n

        // Mark presence of elements
        for (int num : arr) {
            hash[num] = 1;
        }

        // Find missing number
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        return -1; // should not happen
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 }; // Missing 3
        System.out.println("Missing Number: " + findMissing(arr));
    }
}

// TC = 0(n) +0(n)
// Tc = o(n)
