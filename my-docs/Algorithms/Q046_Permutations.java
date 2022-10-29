import java.util.*;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q046_Permutations {

    public static void main(String[] args) {
        Q046_Permutations q046Permutations = new Q046_Permutations();
        int[] nums = {1, 2, 3};
        System.out.println(q046Permutations.permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> allPermutations = new ArrayList<>();
        backtrack(nums, new LinkedList<>(), allPermutations);
        return allPermutations;
    }

    public void backtrack(int[] nums, LinkedList<Integer> permutation, List<List<Integer>> allPermutations) {
        if (permutation.size() >= nums.length) {
            allPermutations.add(new LinkedList(permutation));
            return;
        }
        for (int num : nums) {
            if (permutation.contains(num)) {
                continue;
            }
            permutation.add(num);
            backtrack(nums, permutation, allPermutations);
            permutation.removeLast();
        }
    }
}