package Step2BinarySearch;

public class LeastCapacitybyOptimal {
      public static int leastCap(int[] arr, int days){
       int low = Integer.MIN_VALUE, high = 0;
        for(int num : arr){
            low = Math.max(low,num);
            high += num;
        }
        int ans = high ;
        while(low <= high){
            int mid = (low+high)/2;
            if(daysReq(arr,mid) <= days){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
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
//tc = 0(n*log(s))
