import DataStructure.Builders;
import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/26
 */
class Q103_BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        Integer[] list = {3,9,20,null,null,15,7};
        TreeNode root = new TreeNode(list[0]);
        Builders.buildTree(root, 0, list);
        System.out.println(zigzagLevelOrder(root));
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> reverseStack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty() || !reverseStack.isEmpty()) {
            if (!stack.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                while (!stack.isEmpty()) {
                    TreeNode node = stack.pop();
                    level.add(node.val);
                    if (node.left != null) {
                        reverseStack.add(node.left);
                    }
                    if (node.right != null) {
                        reverseStack.add(node.right);
                    }
                }
                result.add(level);
                continue;
            }
            if (!reverseStack.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                while (!reverseStack.isEmpty()) {
                    TreeNode node = reverseStack.pop();
                    level.add(node.val);
                    if (node.right != null) {
                        stack.add(node.right);
                    }
                    if (node.left != null) {
                        stack.add(node.left);
                    }
                }
                result.add(level);
            }
        }
        return result;
    }
}