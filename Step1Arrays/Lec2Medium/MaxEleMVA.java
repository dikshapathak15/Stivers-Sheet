

public class MaxEleMVA {
    public static int maxEle(int[] arr){
        int cnt = 0;
        int ele = -1;

        //phase 1: find candidate
        for(int num : arr){
            if(cnt == 0){
                ele = num;
            }
            cnt += (num == ele)? 1: -1;
        }

        //phase 2: verify candidate
        cnt = 0;
        for(int num : arr){
            if(num == ele){
                cnt++;
            }
        }
        return(cnt > arr.length/2)? ele : -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,2,2,3,1};
        System.out.println(maxEle(arr));
    }
}
//tc = 0(2n) = 0(n) constatnt don't change how fast the function grows, both are in the sma eorder of growth(linear)
// sc = 0(1)
