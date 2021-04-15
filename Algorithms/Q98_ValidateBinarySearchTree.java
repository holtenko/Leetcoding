import DataStructure.TreeNode;

/**
 * @author holten
 * @date 2021/3/7
 */
class Q98_ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.right = node3;
        node3.left = node2;
        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValidBST(TreeNode root, long low, long hi) {
        if (root == null) {
            return true;
        }
        if (root.val <= low || root.val >= hi) {
            return false;
        }
        return isValidBST(root.left, low, root.val) && isValidBST(root.right, root.val, hi);
    }
}