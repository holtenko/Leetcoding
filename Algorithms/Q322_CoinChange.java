import java.util.HashMap;
import java.util.Map;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q322_CoinChange {

    public static void main(String[] args) {
        Q322_CoinChange q322CoinChange = new Q322_CoinChange();
        int[] coins = {2};
        int amount = 3;
        System.out.println(q322CoinChange.coinChange(coins, amount));
    }

    public int coinChange(int[] coins, int amount) {
        Map<Integer, Integer> countMap = new HashMap<>();
        return count(coins, amount, countMap);
    }

    public int count(int[] coins, int amount, Map<Integer, Integer> countMap) {
        if (countMap.containsKey(amount)) {
            return countMap.get(amount);
        }
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        int totalCount = Integer.MAX_VALUE;
        for (int coin : coins) {
            int count = count(coins, amount - coin, countMap);
            if (count == -1) {
                continue;
            }
            if (totalCount > count) {
                totalCount = count + 1;
            }
        }
        if (totalCount == Integer.MAX_VALUE) {
            totalCount = -1;
        }
        countMap.put(amount, totalCount);
        return totalCount;
    }
}