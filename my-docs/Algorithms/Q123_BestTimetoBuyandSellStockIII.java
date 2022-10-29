/**
 * @author holten
 * @date 2020-12-14
 * Email: holten.ko@gmail.com
 */

public class Q123_BestTimetoBuyandSellStockIII {

    public static void main(String[] args) {
        Q123_BestTimetoBuyandSellStockIII q121BestTimetoBuyandSellStock = new Q123_BestTimetoBuyandSellStockIII();
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(q121BestTimetoBuyandSellStock.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int dp_0_1_0 = 0;
        int dp_0_1_1 = Integer.MIN_VALUE;
        int dp_0_2_0 = 0;
        int dp_0_2_1 = Integer.MIN_VALUE;
        for (int price : prices) {
            int dp_i_1_0 = Integer.max(dp_0_1_0, dp_0_1_1 + price);
            int dp_i_1_1 = Integer.max(dp_0_1_1, -price);
            int dp_i_2_0 = Integer.max(dp_0_2_0, dp_0_2_1 + price);
            int dp_i_2_1 = Integer.max(dp_0_2_1, dp_0_1_0 - price);
            dp_0_1_0 = dp_i_1_0;
            dp_0_1_1 = dp_i_1_1;
            dp_0_2_0 = dp_i_2_0;
            dp_0_2_1 = dp_i_2_1;
        }
        return dp_0_2_0;
    }
}