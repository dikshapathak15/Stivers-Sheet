package Step1Arrays.Lec2Medium;

public class BuyAndSellStock {
    public static int maxProf(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit , profit);
            } else{
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int ans = maxProf(prices);
        System.out.println("Maximum profit: " + ans);
    }
}
//tc = 0(n)
//sc = 0(1)
