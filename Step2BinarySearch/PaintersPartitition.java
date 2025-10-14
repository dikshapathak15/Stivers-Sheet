package Step2BinarySearch;

public class PaintersPartitition {
     public static int painterPartition(int[] nums, int k) {
        int low = 0 , high = 0;
        for(int num : nums){
            low = Math.max(num,low);
            high += num;
        }
      for (int i = low ; i <= high ; i++){
        int cnt = totalArrCnt(nums, i);
        if(cnt == k) return i;
      }
      return -1;
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
//tc = 0((sum-max + 1 )* n)