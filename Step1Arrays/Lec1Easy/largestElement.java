

public class largestElement {
      public static int LargestElement(int[] num) {
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
       int value = LargestElement(num);
       System.out.println(value);
    }
}


//TC = 0(n)
//SC = 0(1)
