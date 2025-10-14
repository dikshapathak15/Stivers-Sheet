package Step2BinarySearch;

public class PaintersPartition {
    public static int painterPartition(int[] nums, int k) {
        int low = 0 , high = 0;
        for(int num : nums){
            low = Math.max(num,low);
            high += num;
        }
        while(low <= high){
            int mid = (low+high)/2;
            int cnt = totalArrCnt(nums,mid);
            if(cnt > k) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
    public static int totalArrCnt(int[] nums, int i){
        int cnt = 1, totalArrSum = 0;
        for (int j = 0 ; j < nums.length ; j++){
            if(totalArrSum + nums[j] <= i){
                totalArrSum += nums[j];
            }else{
                cnt++;
                totalArrSum = nums[j];
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int nums[] = {10,20,30,40};
        int m = 2;
        System.out.println("The The minimum time required to paint is: " + painterPartition(nums, m));
    }
}
