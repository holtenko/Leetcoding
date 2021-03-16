import DataStructure.Builders;
import DataStructure.TreeNode;

/**
 * @author holten
 * @date 2021/3/16
 */
class Q1038_BinarySearchTreeToGreaterSumTree {
    public static void main(String[] args) {
        Integer[] tree = {4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8};
        TreeNode root = new TreeNode(tree[0]);
        Builders.buildTree(root, 0, tree);
        System.out.println(bstToGst(root));
    }

    private static int sum = 0;

    public static TreeNode bstToGst(TreeNode root) {
        if (root == null) {
            return null;
        }
        bstToGst(root.right);
        sum = sum + root.val;
        root.val = sum;
        bstToGst(root.left);
        return root;
    }
}