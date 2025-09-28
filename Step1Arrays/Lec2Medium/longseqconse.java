

public class longseqconse {
    public static int longseqconsecutive(int[] arr) {
        int longest = 1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int cnt = 1;
            while (ls(arr, x + 1) == true) {
                x = x + 1;
                cnt++;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static boolean ls(int[] arr, int num) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == num)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
        System.out.println(longseqconsecutive(arr));
    }
}
//tc = 0(n^2)
//sc = 0(1)
