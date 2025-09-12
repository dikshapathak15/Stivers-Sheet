package Step1Arrays.Lec2Medium;

public class MaxElement {
    public static int maxEle(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            int cnt = 0;
            for(int j = 0; j < arr.length ; j++){
                if(arr[j] == arr[i]){
                    cnt++;
                }
                if(cnt > arr.length/2) return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,2,3,1,2};
        System.out.println(maxEle(arr));
    }
}
//tc = 0(n^2)
//sc = 0(1)