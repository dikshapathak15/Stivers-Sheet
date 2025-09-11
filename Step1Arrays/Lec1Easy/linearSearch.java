

public class linearSearch {
    public static int linearsearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 76 };
        int key = 5;
        int index = linearsearch(arr, key);
        System.out.println("The element is found at the index: " + index);
    }
}

// TC = 0(n)
// SC - 0(1)