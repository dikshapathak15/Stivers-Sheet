

import java.util.ArrayList;
import java.util.List;

public class intersectionOptimal {
    public static List<Integer> intersectionbyOptimal(int arr1[], int arr2[]) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                // avoid duplicates in result
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;

            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
          int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 3, 4, 5, 6 };

        
        List<Integer> result = intersectionbyOptimal(arr1, arr2);
        System.out.println("Intersection of arrays: " + result);
    }

}
