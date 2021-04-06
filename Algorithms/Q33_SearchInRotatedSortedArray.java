/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q33_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(search(nums, 1));
    }

    public static int search(int[] nums, int target) {
        int k = 1;
        while (k < nums.length && nums[k - 1] < nums[k]) {
            k++;
        }
        k = k % nums.length;
        int start;
        int end;
        if (k > 0) {
            if (nums[0] > target) {
                start = k;
                end = nums.length - 1;
            } else if (nums[0] < target) {
                start = 1;
                end = k - 1;
            } else {
                return 0;
            }
        } else {
            start = 0;
            end = nums.length - 1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midNum = nums[mid];
            if (midNum == target) {
                return mid;
            } else if (midNum > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}