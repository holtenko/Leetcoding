import DataStructure.Builders;
import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/3/26
 */
class Q94_BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        Integer[] list = {1, null, 2, 3};
        TreeNode root = new TreeNode(list[0]);
        Builders.buildTree(root, 0, list);
        System.out.println(inorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    private static void inorderTraversal(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, result);
        result.add(root.val);
        inorderTraversal(root.right, result);
    }
}