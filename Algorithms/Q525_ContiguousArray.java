import java.util.HashMap;
import java.util.Map;

/**
 * @author holten
 * @date 2021/3/10
 */
class Q525_ContiguousArray {
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(findMaxLength(nums));
    }

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> countIndexMap = new HashMap<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count--;
            }
            if (nums[i] == 1) {
                count++;
            }
            if (count == 0) {
                int len = i + 1;
                max = len > max ? len : max;
                continue;
            }
            if (countIndexMap.containsKey(count)) {
                int len = i - countIndexMap.get(count);
                max = len > max ? len : max;
            } else {
                countIndexMap.put(count, i);
            }
        }
        return max;
    }
}