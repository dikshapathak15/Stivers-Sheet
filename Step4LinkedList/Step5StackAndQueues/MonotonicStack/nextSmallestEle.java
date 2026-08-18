import java.util.Arrays;

class nextSmallestEle{
     public static int[] nextSmallestElement(int[] arr){

        int n = arr.length;

        int ans[] = new int[n];
        Arrays.fill(ans, -1);

        for(int i = 0 ; i < n ; i++){
            for(int j = i +1 ; j < n ; j++){
                if (arr[i] > arr[j]) {
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
     }
     public static void main(String[] args) {
        int[] arr = {1, 3, 4, 0, 9, 7,2};
        int[] ans = nextSmallestElement(arr);

        for(int i = 0 ; i < ans.length; i++){
            System.out.println(ans[i]);
        }
        System.out.println();
     }
}

//tc = 0(n^2) as we traverse the array in nested manner
//  and space complexity = 0(n)