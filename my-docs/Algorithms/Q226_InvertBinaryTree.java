import DataStructure.ListNode;
import DataStructure.TreeNode;

/**
 * @author holten
 * @date 2021/3/7
 */
class Q226_InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.right = node3;
        node3.left = node2;
        System.out.println(invertTree(root));
    }

    public static TreeNode invertTree(TreeNode root) {
        swapChild(root);
        return root;
    }

    private static void swapChild(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        swapChild(root.left);
        swapChild(root.right);
    }
}