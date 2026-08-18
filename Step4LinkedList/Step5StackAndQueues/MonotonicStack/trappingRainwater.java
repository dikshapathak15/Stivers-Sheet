public class trappingRainwater {

    public static int trap(int[] height){
        int n = height.length;
        int totalWater = 0;

        for(int i = 0 ; i < n ; i++){
            int leftMaxHeight = 0;
            int rightMaxHeight = 0;

            //forleftMAxHeight
            for(int j = 0; j <= i; j++){
                if (height[j] > leftMaxHeight) {
                    leftMaxHeight = height[j];
                }
            }

            //for RightMAxHeight
            for(int j = i; j < n ; j++){
                if(height[j] > rightMaxHeight){
                   rightMaxHeight = height[j];
                }
            }

            totalWater += Math.min(leftMaxHeight, rightMaxHeight) - height[i];
        }
        return totalWater;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int result = trap(height);
        System.out.println("Trapped Rainwater: " + result);
    }
}

//tc = 0(n^2)
//sc = 0(n)