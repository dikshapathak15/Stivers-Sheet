package Step2BinarySearch;

public class LeastCapacityofship {
    public static int leastCap(int[] arr, int days){
        int min = Integer.MIN_VALUE, max = 0;
          for(int num : arr){ 
            min = Math.max(min, num) ;
            max += num;
        }
        for(int cap = min ; cap <= max ; cap++){
            if(daysReq(arr,cap) <= days){
                return cap;
            }
        }
        return -1;
    }
    public static int daysReq(int[] arr , int cap){
        int currLoad = 0;
        int day = 1;
        for(int weight : arr){
            if(currLoad + weight <= cap){
                currLoad += weight;  //add more weight on the same day
            }else{
                day++;
                currLoad = weight;
            }
        }
        return day;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println("The least capacity of a ship is: " + leastCap(arr,days));
    }
}
