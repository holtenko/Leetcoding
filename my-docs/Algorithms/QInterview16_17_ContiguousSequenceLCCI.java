
/**
 * @author holten
 * @date 2021/3/10
 */
class QInterview16_17_ContiguousSequenceLCCI {
    public static void main(String[] args) {
        int[] nums = {-2};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int pre = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            if (pre + cur > cur) {
                pre += cur;
            } else {
                pre = cur;
            }
            if (pre > max) {
                max = pre;
            }
        }
        return max;
    }
}