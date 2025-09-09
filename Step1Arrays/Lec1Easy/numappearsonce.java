package Step1Arrays.Lec1Easy;

public class numappearsonce {
    public static int appearance(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            int num = arr[i];

            // Count occurrences of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (num == arr[j]) {
                    cnt++;
                }
            }

            // If this number appears only once, return it
            if (cnt == 1) {
                return num;
            }
        }
        return -1; // if no unique element found
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        System.out.println("The num which appears once is: " + appearance(arr));
    }
}
//tc = 0(n^2)
//sc = 0(1)
