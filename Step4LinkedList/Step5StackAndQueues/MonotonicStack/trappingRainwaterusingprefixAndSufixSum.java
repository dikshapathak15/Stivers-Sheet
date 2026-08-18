public class trappingRainwaterusingprefixAndSufixSum {
     public static int trap(int[] height){
        int n = height.length;
        int totalWater = 0;

        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        //PrefixSum
        prefixSum[0] = height[0];

        for(int i = 1 ; i < n; i++){
            prefixSum[i] = Math.max(prefixSum[i-1], height[i]);
        }

        //SuffixSum
        suffixSum[n-1] = height[n-1];
        for(int i = n-2 ; i>=0 ; i--){
            suffixSum[i] = Math.max(suffixSum[i+1], height[i]);
        }


        for(int i = 0 ; i < n ; i++){

            totalWater += Math.min(prefixSum[i], suffixSum[i]) - height[i];
        }
        return totalWater;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int result = trap(height);
        System.out.println("Trapped Rainwater: " + result);
    }
}

//tc = 0(3n) three separate loops
//sc = 0(n) extra array space is used to store suffix and prefix sum