import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by holten on 2020-12-26.
 * Email: holten.ko@foxmail.com
 */

class Q198_HouseRobber {
    public static void main(String[] args) {
        Q198_HouseRobber q198HouseRobber = new Q198_HouseRobber();
        int[] nums = {1, 2, 3, 1};
        System.out.println(q198HouseRobber.rob1(nums));
    }

    private int[] mem;

    public int rob(int[] nums) {
        mem = new int[nums.length];
        Arrays.fill(mem, -1);
        return rob(nums, 0);
    }

    public int rob(int[] nums, int start) {
        if (start > nums.length - 1) {
            return 0;
        }
        if (mem[start] != -1) {
            return mem[start];
        }
        int max = Math.max(rob(nums, start + 1), nums[start] + rob(nums, start + 2));
        mem[start] = max;
        return max;
    }

    public int rob1(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len + 2];
        for (int i = len - 1; i >= 0; i--) {
            dp[i] = Math.max(dp[i + 1], nums[i] + dp[i + 2]);
        }
        return dp[0];
    }
}