/**
 * @author holten
 * @date 2021/4/7
 */
class Q81_SearchInRotatedSortedArrayII {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 2, 2, 5, 6};
        System.out.println(search(nums, 2));
    }

    public static boolean search(int[] nums, int target) {
        int tailIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                tailIndex = i - 1;
                break;
            }
            if (i == nums.length - 1) {
                tailIndex = nums.length - 1;
            }
        }
        int lo = 0;
        int hi = tailIndex;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int midNum = nums[mid];
            if (midNum == target) {
                return true;
            } else if (midNum > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        if (tailIndex >= nums.length - 1) {
            return false;
        }

        lo = tailIndex + 1;
        hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int midNum = nums[mid];
            if (midNum == target) {
                return true;
            } else if (midNum > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return false;
    }
}