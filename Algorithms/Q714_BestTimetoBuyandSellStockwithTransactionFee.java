/**
 * @author holten
 * @date 2020-12-14
 * Email: holten.ko@gmail.com
 */

public class Q714_BestTimetoBuyandSellStockwithTransactionFee {

    public static void main(String[] args) {
        Q714_BestTimetoBuyandSellStockwithTransactionFee q714BestTimetoBuyandSellStockwithTransactionFee = new Q714_BestTimetoBuyandSellStockwithTransactionFee();
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        System.out.println(q714BestTimetoBuyandSellStockwithTransactionFee.maxProfit(prices, fee));
    }

    public int maxProfit(int[] prices, int fee) {
        int dp_0_0 = 0;
        int dp_0_1 = Integer.MIN_VALUE;
        for (int price : prices) {
            int dp_i_0 = Integer.max(dp_0_0, dp_0_1 + price);
            int dp_i_1 = Integer.max(dp_0_1, dp_0_0 - price - fee);
            dp_0_0 = dp_i_0;
            dp_0_1 = dp_i_1;
        }
        return dp_0_0;
    }
}