import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author holten
 * @date 2021/5/29
 * <p>
 * Given an array of integers nums and an integer k,
 * return the total number of continuous subarrays whose sum equals to k.
 * <p>
 * Example 1:
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * <p>
 * Example 2:
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 * <p>
 * Constraints:
 * 1 <= nums.length <= 2 * 104
 * -1000 <= nums[i] <= 1000
 * -107 <= k <= 107
 */
class Q560_SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {-1, -1, 1};
        int k = 0;
        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> preSumCount = new HashMap<>();
        preSumCount.put(0, 1);
        int result = 0;
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            int left = pre - k;
            if (preSumCount.containsKey(left)) {
                result += preSumCount.get(left);
            }
            preSumCount.put(pre, preSumCount.getOrDefault(pre, 0) + 1);
        }
        return result;
    }
}