/**
 * @author holten
 * @date 2021/4/6
 */
class Q80_RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return 2;
        }
        int result = 1;
        int preNum = nums[0];
        int times = 1;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            int curNum = nums[i];
            if (preNum == curNum) {
                if (times < 2) {
                    result++;
                    times++;
                    index++;
                }
            } else {
                preNum = curNum;
                times = 1;
                result++;
                index++;
            }
            nums[index] = curNum;
        }
        return result;
    }
}