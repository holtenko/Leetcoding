import java.util.HashMap;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q001_TwoSum {
    public static void main(String[] args) {
        System.out.println(1);
    }

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int[2];
        HashMap numsHashmap = new HashMap(len);
        for (int i = 0; i < len; i++) {
            numsHashmap.put(nums[i], i);
        }
        for (int i = 0; i < len; i++) {
            if (numsHashmap.get(target - nums[i]) != null && Integer.parseInt(numsHashmap.get(target - nums[i]).toString()) != i) {
                result[0] = i;
                result[1] = Integer.parseInt(numsHashmap.get(target - nums[i]).toString());
                break;
            }
        }
        return result;
    }
}