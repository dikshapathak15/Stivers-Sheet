package Step1Arrays.Lec2Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leaderele {
    public static List<Integer> leaderElement(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader == true)
                ans.add(arr[i]);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        List<Integer> result = leaderElement(arr);
        System.out.println("The leader elements are: " + result);
    }
}
// tc = 0(n^2)
// sc = 0(n)
