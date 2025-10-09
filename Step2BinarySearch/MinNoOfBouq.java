package Step2BinarySearch;

public class MinNoOfBouq {
    public static int minDaysLinear(int[] bloomDay, int m , int k){
        if(m*k > bloomDay.length) return -1;
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;

        for(int d : bloomDay){
            min = Math.min(min, d);
            max = Math.max(max, d);
        }//found the range

        for(int days = min ; days <= max; days++){
            if(canMake(bloomDay,days,m,k)){
                return days;
            }
        }
        return -1;
    }

    public static boolean canMake(int[] bloomDay , int days , int m , int k){
        int bouquets = 0;
        int flowers = 0;

        for(int d : bloomDay){
            if(d <= days){
                flowers ++;
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
        int bloomDay[] = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 2; // no of bouq
        int k = 3; // no of flowers
        System.out.println("The min no of days requires to make " + m + " bouquets are " + minDaysLinear(bloomDay, m, k));
    }
}
//tc = 0(n * d), n = size of the array , d = ranges of day