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
class Q199_BinaryTreeRightSideView {
    public static void main(String[] args) {
        Integer[] list = {1, 2, 3, null, 5, null, 4};
        TreeNode root = new TreeNode(list[0]);
        Builders.buildTree(root, 0, list);
        System.out.println(rightSideView(root));
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue1 = new LinkedList<>();
        queue1.add(root);
        Queue<TreeNode> queue2 = new LinkedList<>();
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            Queue<TreeNode> queue = queue1.isEmpty() ? queue2 : queue1;
            Queue<TreeNode> nextQueue = queue1.isEmpty() ? queue1 : queue2;
            result.add(queue.peek().val);
            while (!queue.isEmpty()) {
                TreeNode cur = queue.poll();
                if (cur.right != null) {
                    nextQueue.add(cur.right);
                }
                if (cur.left != null) {
                    nextQueue.add(cur.left);
                }
            }
        }
        return result;
    }
}