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
class Q102_BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Integer[] list = {1};
        TreeNode root = new TreeNode(list[0]);
        Builders.buildTree(root, 0, list);
        System.out.println(levelOrder(null));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(root);
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            Queue<TreeNode> curQueue = queue1.isEmpty() ? queue2 : queue1;
            Queue<TreeNode> nextQueue = queue1.isEmpty() ? queue1 : queue2;

            List<Integer> level = new ArrayList<>();
            while (!curQueue.isEmpty()) {
                TreeNode node = curQueue.poll();
                level.add(node.val);
                if (node.left != null) {
                    nextQueue.add(node.left);
                }
                if (node.right != null) {
                    nextQueue.add(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}