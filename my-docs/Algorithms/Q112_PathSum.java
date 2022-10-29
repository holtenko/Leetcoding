import DataStructure.Builders;
import DataStructure.TreeNode;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q112_PathSum {
    public static void main(String[] args) {
        Integer[] nums = {1, 2};
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        int targetSum = 1;
        System.out.println(hasPathSum(root, targetSum));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        int preSum = 0;
        return traversal(root, preSum, targetSum);
    }


    private static boolean traversal(TreeNode root, int preSum, int targetSum) {
        if (root == null) {
            return false;
        }
        int cur = preSum + root.val;
        if (root.left == null && root.right == null) {
            return cur == targetSum;
        }
        return traversal(root.left, cur, targetSum) || traversal(root.right, cur, targetSum);
    }
}