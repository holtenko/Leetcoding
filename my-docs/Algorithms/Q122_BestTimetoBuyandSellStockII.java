/**
 * @author holten
 * @date 2020-12-14
 * Email: holten.ko@gmail.com
 */

public class Q122_BestTimetoBuyandSellStockII {

    public static void main(String[] args) {
        Q122_BestTimetoBuyandSellStockII q121BestTimetoBuyandSellStock = new Q122_BestTimetoBuyandSellStockII();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(q121BestTimetoBuyandSellStock.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int dp_0_0 = 0;
        int dp_0_1 = Integer.MIN_VALUE;
        for (int price : prices) {
            int dp_i_0 = Integer.max(dp_0_0, dp_0_1 + price);
            int dp_i_1 = Integer.max(dp_0_1, dp_0_0 - price);
            dp_0_0 = dp_i_0;
            dp_0_1 = dp_i_1;
        }
        return dp_0_0;
    }
}