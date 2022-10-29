import DataStructure.Builders;
import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author holten
 * @date 2021/3/26
 */
class Q783_MinimumDistanceBetweenBSTNodes {
    public static void main(String[] args) {
        Integer[] list = {1};
        TreeNode root = new TreeNode(list[0]);
        Builders.buildTree(root, 0, list);
        System.out.println(minDiffInBST(null));
    }

    private static int minDiff = Integer.MAX_VALUE;
    private static int preVal = -1;

    public static int minDiffInBST(TreeNode root) {
        preOrder(root);
        return minDiff;
    }

    private static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);

        if (preVal >= 0) {
            minDiff = Math.min(minDiff, root.val - preVal);
        }
        preVal = root.val;

        preOrder(root.right);
    }
}