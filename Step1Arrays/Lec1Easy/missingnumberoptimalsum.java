package Step1Arrays.Lec1Easy;

public class missingnumberoptimalsum {
       public static int findMissing(int[] arr) {
        int n = arr.length + 1; // total numbers including the missing one

        // Expected sum of 1..n+1
        int expectedSum = (n * (n + 1)) / 2;

        // Actual sum of array elements
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Missing number
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing 3
        System.out.println("Missing Number: " + findMissing(arr));
    }
}

// TC = 0(n) 
// Tc = o(1)
