/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q300_LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        int maxLen = 1;
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            int maxBefore = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[j] > maxBefore) {
                    maxBefore = dp[j];
                }
            }
            dp[i] = maxBefore + 1;
            if (dp[i] > maxLen) {
                maxLen = dp[i];
            }
        }
        return maxLen;
    }
}