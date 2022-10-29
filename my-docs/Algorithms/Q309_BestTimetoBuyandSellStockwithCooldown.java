/**
 * @author holten
 * @date 2020-12-14
 * Email: holten.ko@gmail.com
 */

public class Q309_BestTimetoBuyandSellStockwithCooldown {

    public static void main(String[] args) {
        Q309_BestTimetoBuyandSellStockwithCooldown q309_bestTimetoBuyandSellStockwithCooldown = new Q309_BestTimetoBuyandSellStockwithCooldown();
        int[] prices = {1,2,3,0,2};
        System.out.println(q309_bestTimetoBuyandSellStockwithCooldown.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int dp_pre_0 = 0;
        int dp_0_0 = 0;
        int dp_0_1 = Integer.MIN_VALUE;
        for (int price : prices) {
            int tempPrice = dp_0_0;
            int dp_i_0 = Integer.max(dp_0_0, dp_0_1 + price);
            int dp_i_1 = Integer.max(dp_0_1, dp_pre_0 - price);
            dp_0_0 = dp_i_0;
            dp_0_1 = dp_i_1;
            dp_pre_0 = tempPrice;
        }
        return dp_0_0;
    }
}