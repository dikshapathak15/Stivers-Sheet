

import java.util.*;

public class NextPermutationBrute {
    
    // Function to generate all permutations
    public static void permute(int[] arr, int l, int r, List<List<Integer>> result) {
        if (l == r) {
            List<Integer> perm = new ArrayList<>();
            for (int num : arr) perm.add(num);
            result.add(perm);
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(arr, l, i);
            permute(arr, l + 1, r, result);
            swap(arr, l, i); // backtrack
        }
    }

    // Utility to swap
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to get next permutation by brute force
    public static int[] nextPermutation(int[] nums) {
        int n = nums.length;
        List<List<Integer>> allPermutations = new ArrayList<>();

        // Step 1: Generate all permutations
        permute(nums.clone(), 0, n - 1, allPermutations);

        // Step 2: Sort permutations lexicographically
        allPermutations.sort((a, b) -> {
            for (int i = 0; i < n; i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        // Step 3: Find the current permutation
        List<Integer> current = new ArrayList<>();
        for (int num : nums) current.add(num);

        int idx = 0;
        for (int i = 0; i < allPermutations.size(); i++) {
            if (allPermutations.get(i).equals(current)) {
                idx = i;
                break;
            }
        }

        // Step 4: Return the next one (or the first if last)
        List<Integer> next = allPermutations.get((idx + 1) % allPermutations.size());
        int[] res = new int[n];
        for (int i = 0; i < n; i++) res[i] = next.get(i);

        return res;
    }

    // Driver
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        int[] next = nextPermutation(nums);

        System.out.println(Arrays.toString(next));
    }
}
