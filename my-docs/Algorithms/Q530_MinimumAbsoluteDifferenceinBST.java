import DataStructure.TreeNode;

/**
 * @author holten
 * @date 2021/3/7
 */
class Q530_MinimumAbsoluteDifferenceinBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.right = node3;
        node3.left = node2;
        System.out.println(getMinimumDifference(root));
    }

    private static int pre = -1;
    private static int min = Integer.MAX_VALUE;

    public static int getMinimumDifference(TreeNode root) {
        middle(root);
        return min;
    }

    public static void middle(TreeNode node) {
        if (node == null) {
            return;
        }
        int cur = node.val;
        middle(node.left);
        if (pre != -1) {
            if (cur - pre < min) {
                min = cur - pre;
            }
        }
        pre = cur;
        middle(node.right);
    }
}