import java.util.Arrays;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q34_FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums, 6)));
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length <= 0) {
            return new int[]{-1, -1};
        }
        int first = findFirst(nums, target);
        if (first >= nums.length || nums[first] != target) {
            first = -1;
        }
        int last = first == -1 ? -1 : findLast(nums, first, target);
        return new int[]{first, last};
    }

    private static int findLast(int[] nums, int start, int target) {
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int num = nums[mid];
            if (num > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return nums[start] == target ? start : start - 1;
    }

    private static int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int num = nums[mid];
            if (num >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return nums[start] == target ? start : start + 1;
    }
}