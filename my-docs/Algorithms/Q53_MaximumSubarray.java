import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q53_MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (sum + num > num) {
                sum += num;
            } else {
                sum = num;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}