import DataStructure.Builders;
import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q104_MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Integer[] nums = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
        TreeNode root = Builders.buildTree(new TreeNode(nums[0]), 0, nums);
        System.out.println(maxDepth(root));
    }

    private static int max = 0;

    public static int maxDepth(TreeNode root) {
        maxDepth(root, 0);
        return max;
    }

    private static void maxDepth(TreeNode root, int depth) {
        if (root == null) {
            if (depth > max) {
                max = depth;
            }
            return;
        }
        maxDepth(root.left, depth + 1);
        maxDepth(root.right, depth + 1);
    }
}