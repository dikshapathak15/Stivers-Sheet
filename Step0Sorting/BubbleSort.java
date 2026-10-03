package Step0Sorting;

public class BubbleSort {
       public  static int[] bubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0 ; i < n-1 ; i++){

            for(int j = 0 ; j < n - 1 - i; j++){
                   if (arr[j] > arr[j+1]) {
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                   }
            }
            }
            return arr;
    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int[] sortedArray = bubbleSort(arr);
        for(int i = 0 ; i < sortedArray.length ; i++){
            System.out.print(sortedArray[i] + " ");
        }
    }
}

//tc = 0(n^2) and space complexity = 0(1)
