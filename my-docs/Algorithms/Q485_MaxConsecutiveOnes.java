/**
 * @author holten
 * @date 2021/2/28
 */
class Q485_MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int num : nums) {
            count = num == 1 ? count + 1 : 0;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}