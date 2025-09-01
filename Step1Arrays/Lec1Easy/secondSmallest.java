package Step1Arrays.Lec1Easy;

public class secondSmallest {
    public static int secondSmallest(int arr[]) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=1 ; i<arr.length ; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] != smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 8, 3, 2 };
        System.out.println("The second smallest number is " + secondSmallest(arr));
    }
}
