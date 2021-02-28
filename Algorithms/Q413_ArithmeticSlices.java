/**
 * @author holten
 * @date 2021/2/28
 */
class Q413_ArithmeticSlices {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 15, 20, 25, 28, 29};
        System.out.println(numberOfArithmeticSlices(nums));
    }

    public static int numberOfArithmeticSlices(int[] nums) {
        if (nums.length <= 2) {
            return 0;
        }
        int total = 0;
        int dpi = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                dpi = dpi + 1;
                total = total + dpi;
            } else {
                dpi = 0;
            }
        }
        return total;
    }
}