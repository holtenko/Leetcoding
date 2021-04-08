/**
 * @author holten
 * @date 2021/4/8
 */
public class Q153_FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,1};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return nums[i];
            }
        }
        return nums[0];
    }
}