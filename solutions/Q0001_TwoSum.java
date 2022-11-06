import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int num2 = target - num1;
            if (numIndexMap.containsKey(num2)) {
                return new int[] { i, numIndexMap.get(num2) };
            }
            numIndexMap.put(num1, i);
        }
        return new int[1];
    }
}