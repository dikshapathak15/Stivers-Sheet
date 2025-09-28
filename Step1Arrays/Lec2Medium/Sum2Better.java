

import java.util.HashMap;
import java.util.Map;

public class Sum2Better {
    public static int[] twoSum(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeeded = target - num;

            if (map.containsKey(moreNeeded)) {
                return new int[] { map.get(moreNeeded), i };
            }

            map.put(num, i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 8, 11 };
        int target = 16;
        int result[] = twoSum(arr, target);

        if (result.length > 0) {
            System.out.println("Indices are " + result[0] + "," + result[1]);
        } else {
            System.out.println("Not found");
        }
    }
}
//tc = 0(n)
//sc= 0(n) used a hashmap
