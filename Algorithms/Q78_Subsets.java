import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/4/25
 */
class Q78_Subsets {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }

    private static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0, new ArrayList<>());
        return result;
    }

    private static void dfs(int[] nums, int index, List<Integer> subset) {
        if (index == nums.length) {
            result.add(subset);
            return;
        }
        dfs(nums, index + 1, new ArrayList<>(subset));
        List<Integer> newSubset = new ArrayList<>(subset);
        newSubset.add(nums[index]);
        dfs(nums, index + 1, newSubset);
    }
}