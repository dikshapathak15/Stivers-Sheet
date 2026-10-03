package Step0Sorting;

public class SelectionSort {
    public  static int[] selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0 ; i < n-1 ; i++){
            int minIndex = i;

            for(int j = i + 1 ; j < n ; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int[] sortedArray = selectionSort(arr);
        for(int i = 0 ; i < sortedArray.length ; i++){
            System.out.print(sortedArray[i] + " ");
        }
    }
}

//tc = 0(n^2) and space complexity = 0(1)
