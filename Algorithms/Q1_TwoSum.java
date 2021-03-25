import java.util.Arrays;
import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 1, 3, 6, 2, 7, 9, 1};
        System.out.println(Arrays.toString(twoSum(nums, 10)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}