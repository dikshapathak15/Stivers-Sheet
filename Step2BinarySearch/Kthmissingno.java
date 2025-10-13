package Step2BinarySearch;

public class Kthmissingno {
    public static int Kthmissingnumber(int[] arr, int k){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] <= k){
                k++;
            }else{
                break;
            }
         }
        return k;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,11};
        int k = 5;
        System.out.println("The kth missing number is: " + Kthmissingnumber(arr,k));
    }
}
//tc = 0(n)
