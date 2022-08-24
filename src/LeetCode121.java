/***
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int min = 1_000_000_000;
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (price < min)
                min = price;

            int profit = price - min;
            if (profit > res)
                res = profit;
        }
        return res;
    }
}




