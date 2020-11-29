import java.util.Arrays;

/**
 * @author holten
 * @date 2020-11-22
 * Email: holten.ko@gmail.com
 */
public class Q34_FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        Q34_FindFirstandLastPositionofElementinSortedArray q34 = new Q34_FindFirstandLastPositionofElementinSortedArray();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(q34.searchRange(nums, target)));
    }

    public int[] searchRange(int[] nums, int target) {
        int left = searchLeft(nums, target);
        System.out.println(left);
        int right = searchRight(nums, target);
        System.out.println(right);
        return new int[]{left, right};
    }

    public int searchLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (left >= nums.length) {
            return -1;
        }
        return nums[left] == target ? left : -1;
    }

    public int searchRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (left <= 0) {
            return -1;
        }
        return nums[left-1] == target ? left-1 : -1;
    }
}