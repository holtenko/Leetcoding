import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q169_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,3,2,7,5,8,6};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        quickSort(nums);
        return nums[nums.length / 2];
    }

    private static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = end;
        int pivotValue = nums[pivot];

        int lo = start;
        int hi = end - 1;
        while (lo < hi) {
            int loValue = nums[lo];
            int hiValue = nums[hi];
            if (loValue <= pivotValue) {
                lo++;
                continue;
            }
            if (hiValue > pivotValue) {
                hi--;
                continue;
            }
            swap(nums, lo++, hi--);
        }

        if (nums[lo] > pivotValue) {
            swap(nums, lo, pivot);
            pivot = lo;
        } else {
            swap(nums, lo + 1, pivot);
            pivot = lo + 1;
        }
        quickSort(nums, start, pivot - 1);
        quickSort(nums, pivot + 1, end);
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}