package Step2BinarySearch;

public class MinNoOfBouq {
     public static int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length) return -1;
        int low = Integer.MAX_VALUE , high = Integer.MIN_VALUE;

        for(int d : bloomDay){
            low = Math.min(d,low);
            high = Math.max(d,high);
        }
        int ans = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(canMake(bloomDay, mid , m , k)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static boolean canMake(int[] bloomDay , int day , int m, int k){
        int bouquets = 0;
        int flowers = 0;

        for(int d : bloomDay){
            if(d <= day){
                flowers++;
                if(flowers == k){
                    bouquets ++;
                    flowers = 0;
                }
            }else{
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
    public static void main(String[] args) {
        int bloomDay[] = {7,7,7,7,13,11,12,7};
        int m = 2; // no of bouq
        int k = 3; // no of flowers
        System.out.println("The min no of days requires to make " + m + " bouquets are " + minDays(bloomDay,m,k));
    }
}
//tc = 0(n * log d) n = size of array, d= range of days
