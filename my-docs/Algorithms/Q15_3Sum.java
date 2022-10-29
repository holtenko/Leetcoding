import DataStructure.Builders;
import DataStructure.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q15_3Sum {
    public static void main(String[] args) {
        int[] nums = {-2,0,0,2,2};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result;
        }
        quickSort(nums);
        int pre = nums[0] - 1;
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (cur == pre) {
                continue;
            }
            pre = cur;
            List<List<Integer>> twoResult = twoSum(nums, i + 1, -cur);
            if (!twoResult.isEmpty()) {
                for (List<Integer> list : twoResult) {
                    list.add(cur);
                    result.add(list);
                }
            }
        }

        return result;
    }

    private static List<List<Integer>> twoSum(int[] nums, int start, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int lo = start;
        int hi = nums.length - 1;

        while (lo < hi) {
            int sum = nums[lo] + nums[hi];
            int left = nums[lo];
            int right = nums[hi];

            if (sum > target) {
                while (lo < hi && nums[hi] == right) {
                    hi--;
                }
            } else if (sum < target) {
                while (lo < hi && nums[lo] == left) {
                    lo++;
                }
            } else {
                List<Integer> pair = new ArrayList<>();
                pair.add(nums[lo++]);
                pair.add(nums[hi--]);
                result.add(pair);
                while (lo < hi && nums[hi] == right) {
                    hi--;
                }
                while (lo < hi && nums[lo] == left) {
                    lo++;
                }
            }
        }
        return result;
    }

    private static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int p = nums[right];
        int lo = left;
        int hi = right - 1;
        while (lo < hi) {
            if (nums[lo] < p) {
                lo++;
                continue;
            }
            if (nums[hi] >= p) {
                hi--;
                continue;
            }
            swap(nums, lo, hi);
            lo++;
            hi--;
        }
        while (hi < right) {
            if (nums[hi] > p) {
                swap(nums, hi, right);
                break;
            }
            hi++;
        }
        quickSort(nums, left, hi - 1);
        quickSort(nums, hi + 1, right);
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}