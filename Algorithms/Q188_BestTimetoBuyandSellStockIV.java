import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author holten
 * @date 2020-12-14
 * Email: holten.ko@gmail.com
 */

public class Q188_BestTimetoBuyandSellStockIV {

    public static void main(String[] args) {
        Q188_BestTimetoBuyandSellStockIV q188BestTimetoBuyandSellStockIV = new Q188_BestTimetoBuyandSellStockIV();
        int k = 2;
        int[] prices = {3, 2, 6, 5, 0, 3};
        System.out.println(q188BestTimetoBuyandSellStockIV.maxProfit(k, prices));
    }

    public int maxProfit(int k, int[] prices) {
        int days = prices.length;
        if (k > days / 2) {
            return maxProfit(prices);
        }

        int[][] dp0 = new int[days][k + 1];
        int[][] dp1 = new int[days][k + 1];
        for (int day = 0; day < days; day++) {
            for (int ck = k; ck >= 1; ck--) {
                if (day == 0) {
                    dp0[day][ck] = 0;
                    dp1[day][ck] = -prices[day];
                    continue;
                }
                dp0[day][ck] = Integer.max(dp0[day - 1][ck], dp1[day - 1][ck] + prices[day]);
                dp1[day][ck] = Integer.max(dp1[day - 1][ck], dp0[day - 1][ck - 1] - prices[day]);
            }
        }
        return dp0[days - 1][k];
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