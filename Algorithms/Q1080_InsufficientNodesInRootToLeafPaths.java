import DataStructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author holten
 * @date 2021/3/10
 */
class Q1080_InsufficientNodesInRootToLeafPaths {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(-3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(-5);
        node1.left = node2;
        node1.right = node3;
        node2.left = node5;
        node3.left = node4;
        int limit = -1;
        TreeNode root = sufficientSubset(node1, limit);
        System.out.println(root);
    }

    public static TreeNode sufficientSubset(TreeNode root, int limit) {
        return delete(root, 0, limit);
    }

    private static TreeNode delete(TreeNode root, int preCount, int limit) {
        if (root == null) {
            return null;
        }
        int currentCount = root.val + preCount;
        if (root.left == null && root.right == null) {
            return currentCount < limit ? null : root;
        }
        root.left = delete(root.left, currentCount, limit);
        root.right = delete(root.right, currentCount, limit);
        if (root.left == null && root.right == null) {
            return null;
        }
        return root;
    }
}