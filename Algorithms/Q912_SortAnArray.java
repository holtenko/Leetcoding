import java.util.Arrays;

/**
 * @author holten
 * @date 2021/3/26
 */
class Q912_SortAnArray {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] nums) {
        quickSort(nums);
        return nums;
    }

    private static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int p = nums[lo];
        int left = lo + 1;
        int right = hi;
        while (left < right) {
            if (nums[left] <= p) {
                left++;
                continue;
            }
            if (nums[right] > p) {
                right--;
                continue;
            }
            swap(nums, left++, right--);
        }
        int pIndex;
        if (nums[left] <= p) {
            pIndex = left;
        } else {
            pIndex = left - 1;
        }
        swap(nums, lo, pIndex);
        quickSort(nums, lo, pIndex - 1);
        quickSort(nums, pIndex + 1, hi);
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}