package Step1Arrays.Lec2Medium;

import java.util.HashSet;
import java.util.Set;

public class longseqconsoptimal {
    public static int longseqconsecutive(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;
        int longest = 1;
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st.add(arr[i]);
        }
        for (int num : st) {
            if (!st.contains(num - 1)) {
                int cnt = 1;
                int x = num;
                while (st.contains(x + 1)) {
                    x++;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
        System.out.println(longseqconsecutive(arr));
    }
}
// tc = 0(n) +0(n) = 0(n)
// sc = 0(n)
