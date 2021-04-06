import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/3/26
 */
class Q46_Permutations {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if (len <= 0) {
            return result;
        }
        return permute(nums, 0, len);
    }

    private static List<List<Integer>> permute(int[] nums, int newIndex, int len) {
        List<List<Integer>> result = new ArrayList<>();
        int cur = nums[newIndex];
        if (newIndex == len - 1) {
            List<Integer> list = new ArrayList<>();
            list.add(cur);
            result.add(list);
            return result;
        }
        List<List<Integer>> preResult = permute(nums, newIndex + 1, len);
        for (List<Integer> list : preResult) {
            for (int i = 0; i < list.size(); i++) {
                List<Integer> newList = new ArrayList<>();
                for (int j = 0; j < list.size(); j++) {
                    if (i == j) {
                        newList.add(cur);
                    }
                    newList.add(list.get(j));
                }
                result.add(newList);
            }
            list.add(cur);
            result.add(list);
        }
        return result;
    }
}