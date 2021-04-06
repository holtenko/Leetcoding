import DataStructure.Builders;
import DataStructure.ListNode;
import DataStructure.TreeNode;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q110_BalancedBinaryTree {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        TreeNode root = Builders.buildTree(new TreeNode(0), 0, nums);
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(maxHeight(root.left) - maxHeight(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private static int maxHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxHeight(root.left), maxHeight(root.right)) + 1;
        }
    }
}