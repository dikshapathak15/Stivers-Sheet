package Step2BinarySearch;

public class AllocatedBooksOptimal {
    public static int minMax(int[] arr, int m){
        int low = 0, high = 0;
        for(int pages: arr){
            low = Math.max(pages, low);
            high += pages;
        }
       while(low <= high){
        int mid = (low + high)/2;
        int cntStd = totalStudent(arr, mid);
        if(cntStd > m) low = mid + 1;
        else high = mid - 1;
       }
       return low;
    }
    public static int totalStudent(int arr[] , int pages){
        int std = 1, totalPages = 0;
        for(int i= 0 ; i < arr.length ; i++){
            if(totalPages + arr[i] <= pages){
                totalPages     += arr[i];
            }else{
                std++;
                totalPages = arr[i];
            }
        }
        return std;
    }
    public static void main(String[] args) {
        int arr[] ={25,46,28,49,24};
        int m = 4;
        System.out.println("The minimum of the maximum pages of book alloted to a student is: " + minMax(arr,m));
    }
}
//0(log(summationof array - maxEle + 1)*n)
