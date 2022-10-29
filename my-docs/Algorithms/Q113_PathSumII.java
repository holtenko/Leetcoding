import DataStructure.Builders;
import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q113_PathSumII {
    public static void main(String[] args) {
        Integer[] nums = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
        TreeNode root = Builders.buildTree(new TreeNode(nums[0]), 0, nums);
        System.out.println(pathSum(root, 22));
    }

    private static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return result;
        }
        List<Integer> path = new ArrayList<>();
        backtrack(root, path, 0, targetSum);
        return result;
    }

    private static void backtrack(TreeNode root, List<Integer> path, int sum, int targetSum) {
        int val = root.val;
        if (root.left == null && root.right == null) {
            if (sum + val == targetSum) {
                path.add(val);
                result.add(new ArrayList<>(path));
                path.remove(path.size() - 1);
            }
            return;
        }
        path.add(val);
        if (root.left != null) {
            backtrack(root.left, path, sum + val, targetSum);
        }
        if (root.right != null) {
            backtrack(root.right, path, sum + val, targetSum);
        }
        path.remove(path.size() - 1);
    }
}