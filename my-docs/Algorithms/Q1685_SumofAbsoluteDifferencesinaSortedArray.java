import java.util.Arrays;

/**
 * @author holten
 * @date 2021/2/28
 */
class Q1685_SumofAbsoluteDifferencesinaSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 8, 10};
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(nums)));
    }

    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        for (int i = 1; i < length; i++) {
            result[0] = result[0] + (nums[i] - nums[0]);
        }
        for (int i = 1; i < length; i++) {
            result[i] = result[i - 1] + (2 * i - length) * (nums[i] - nums[i - 1]);
        }
        return result;
    }
}