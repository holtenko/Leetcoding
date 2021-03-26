import DataStructure.Builders;
import DataStructure.TreeNode;

/**
 * @author holten
 * @date 2021/3/26
 */
class Q236_LowestCommonAncestorOfABinaryTree {
    public static void main(String[] args) {
        Integer[] list = {3,5,1,6,2,0,8,null,null,7,4};
        TreeNode root = new TreeNode(list[0]);
        Builders.buildTree(root, 0, list);
        TreeNode p = null;
        TreeNode q = null;
        System.out.println(lowestCommonAncestor(root, p, q));
    }

    private static TreeNode ancestor;

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        isAncestor(root, p, q);
        return ancestor;
    }

    private static boolean isAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean inLeft = isAncestor(root.left, p, q);
        boolean inRight = isAncestor(root.right, p, q);
        if ((inLeft && inRight) || ((root.equals(p) || root.equals(q)) && (inLeft || inRight))) {
            ancestor = root;
            return true;
        }
        return inLeft || inRight || root.equals(p) || root.equals(q);
    }
}