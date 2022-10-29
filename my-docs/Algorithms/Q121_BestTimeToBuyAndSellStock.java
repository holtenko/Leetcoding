/**
 * @author holten
 * @date 2021/3/24
 */
class Q121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int[][] profit = new int[prices.length][2];
        profit[0][0] = 0;
        profit[0][1] = -prices[0];
        for (int day = 1; day < prices.length; day++) {
            profit[day][0] = Math.max(profit[day - 1][0], profit[day - 1][1] + prices[day]);
            profit[day][1] = Math.max(profit[day - 1][1], -prices[day]);
        }
        return profit[prices.length - 1][0];
    }

}