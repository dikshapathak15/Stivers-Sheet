package Step1Arrays.Lec1Easy;

public class checkingArray {
    public static boolean sortedOrNot(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 5, 9 };
        boolean result = sortedOrNot(arr);
        System.out.println(result);
    }
}
