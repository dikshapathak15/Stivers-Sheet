package Step1Arrays.Lec1Easy;

public class largestElement {
      public static int largestElement(int[] num) {
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i< num.length;i++){
            if(largest<num[i]){
                largest = num[i];
            }
        }
        return largest;
    
    }
    public static void main(String args[]){
        int num[] = {4,6,8,9,10};
       int value = largestElement(num);
       System.out.println(value);
    }
}
