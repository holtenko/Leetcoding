import java.util.Arrays;

/**
 * Created by holten on 2020-12-26.
 * Email: holten.ko@foxmail.com
 */

class Q213_HouseRobberII {
    public static void main(String[] args) {
        Q213_HouseRobberII q213HouseRobberII = new Q213_HouseRobberII();
        int[] nums = {2,3,2};
        System.out.println(q213HouseRobberII.rob(nums));
    }

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(robRange(nums, 0, nums.length - 2), robRange(nums, 1, nums.length - 1));
    }

    public int robRange(int[] nums, int start, int end) {
        int dp_i = 0, dp_i_1 = 0, dp_i_2 = 0;
        for (int i = end; i >= start; i--) {
            dp_i = Math.max(dp_i_1, nums[i] + dp_i_2);
            dp_i_2 = dp_i_1;
            dp_i_1 = dp_i;
        }
        return dp_i;
    }
}