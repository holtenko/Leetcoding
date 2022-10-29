import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author holten
 * @date 2022/1/3
 */
public class Q0001_TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum0(nums, target)));
        System.out.println(Arrays.toString(twoSum1(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    public static int[] twoSum0(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Stack<Integer>> numIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!numIndex.containsKey(num)) {
                numIndex.put(nums[i], new Stack<Integer>());
            }
            numIndex.get(num).push(i);
        }
        Arrays.sort(nums);
        int lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {
            if (nums[lo] + nums[hi] > target) {
                hi--;
            } else if (nums[lo] + nums[hi] < target) {
                lo++;
            } else {
                break;
            }
        }
        int[] result = new int[2];
        result[0] = numIndex.get(nums[lo]).pop();
        result[1] = numIndex.get(nums[hi]).pop();
        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int left = target - nums[i];
            if (numIndex.containsKey(left)) {
                return new int[]{numIndex.get(left), i};
            } else {
                numIndex.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
