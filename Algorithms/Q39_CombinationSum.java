import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/4/24
 */
class Q39_CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinationSum(candidates, 0, target, new ArrayList<>());
        return result;
    }

    private static void combinationSum(int[] candidates, int index, int target, List<Integer> pre) {
        if (index >= candidates.length) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(pre));
            return;
        }

        combinationSum(candidates, index + 1, target, new ArrayList<>(pre));

        int targetLeft = target - candidates[index];
        if (targetLeft >= 0) {
            List<Integer> combine = new ArrayList<>(pre);
            combine.add(candidates[index]);
            combinationSum(candidates, index, targetLeft, combine);
        }
    }
}