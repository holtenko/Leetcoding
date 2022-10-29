import DataStructure.TreeNode;

/**
 * @author holten
 * @date 2021-04-08
 * Email: holten.ko@gmail.com
 */

public class Q105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        System.out.println(buildTree(preorder, inorder));
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        int rootVal = preorder[preLeft];
        TreeNode root = new TreeNode(rootVal);
        int index = inLeft;
        while (inorder[index] != rootVal) {
            index++;
        }
        int leftLen = index - inLeft;
        root.left = buildTree(preorder, inorder, preLeft + 1, preLeft + leftLen, inLeft, index - 1);
        root.right = buildTree(preorder, inorder, preLeft + leftLen + 1, preRight, index + 1, inRight);
        return root;
    }
}