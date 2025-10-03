package Step2BinarySearch.Lec1;

public class FirstAndLastOcc {
    public static void firstandlastOcc(int[] arr, int target){
        int first = -1, last = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }

        if(first == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("First occurence of " + target + " is " + first);
            System.out.println("Last occurence of " + target + " is " + last);
        }

    }
    public static void main(String[] args) {
        int[] arr ={2,3,4,5,6,7,2,8};
        int target = 2;
        firstandlastOcc(arr,target);
    }
}
//tc = 0(n)
//sc = 0(1)