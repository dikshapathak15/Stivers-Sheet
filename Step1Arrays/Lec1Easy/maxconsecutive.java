

public class maxconsecutive {
    public static int maxconsecutive(int arr[]){
        int maxi = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length ; i++){
            if(arr[i] == 1){
                cnt++;
                maxi = Math.max(maxi,cnt);
            }
            else{
                cnt = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] ={1,1,0,1,1,1,0,1,1,1,1};
        System.out.println("max consecutive of 1 is: " + maxconsecutive(arr));
    }
}
