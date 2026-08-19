public class trappingRainwaterOptimal {

    public static int trap(int[] height){
        int n = height.length;

        //initilizing leftMax and rightMax height
        int leftMax = 0;
        int rightMax = 0;

        // initializing left and pointers
        int left = 0;
        int right = n-1;

        int totalWater = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                }else{
                    totalWater += leftMax - height[left];
                }
                left++;
            }else{
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                }else{
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }
        return totalWater;
    }

     public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int result = trap(height);
        System.out.println("Trapped Rainwater: " + result);
    }
}

//tc = 0(n) as two pointers traverse the array only once in the inward direction
//sc = 0(1) no extra space is used for pointers and variables, regardless of input size