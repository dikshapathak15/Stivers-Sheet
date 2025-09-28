

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rearrangeeleifnotequal {
    public static int[] rearrangeEle(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int n = arr.length;

        // seperating negative and positive element
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg.add(arr[i]);
            } else {
                pos.add(arr[i]);
            }
        }

        // case 1: pos> neg
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }

            // add remaining pos element
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;
            }

            // case 2: neg> pos
            if (neg.size() > pos.size()) {
                for (int i = 0; i < pos.size(); i++) {
                    arr[2 * i] = pos.get(i);
                    arr[2 * i + 1] = neg.get(i);
                }

                // add remaining pos element
                index = pos.size() * 2;
                for (int i = pos.size(); i < neg.size(); i++) {
                    arr[index] = neg.get(i);
                    index++;
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 3, -4 ,-4 ,-8};
        int[] result = rearrangeEle(arr);
        System.out.println(Arrays.toString(result));
    }
}
//tc = 0(2n)
//sc= 0(n)
