package Step1Arrays.Lec2Medium;

public class Sum2 {
    public static int[] twoSum(int arr[],int target){
        for(int i = 0; i<arr.length ; i++){
            for(int j=i+1 ; j <arr.length;j++){
                //if(i==j) continue; when we take j=0
                if(arr[i]+arr[j] ==target){
                    return new int[]{i,j};
                }

            }
        }
         return new int[]{};
    }
    public static void main(String[] args) {
        int arr[] = {2,5,6,8,11};
        int target = 14;
         int[] result = twoSum(arr, target);
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + " , " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}

//tc = 0(n^2)
//sc= 0(1) 
