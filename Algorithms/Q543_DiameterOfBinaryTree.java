import DataStructure.Builders;
import DataStructure.TreeNode;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q543_DiameterOfBinaryTree {
    public static void main(String[] args) {
        Integer[] nums = {1, 2};
        TreeNode root = Builders.buildTree(new TreeNode(1), 0, nums);
        System.out.println(diameterOfBinaryTree(root));
    }

    static int diameter = Integer.MIN_VALUE;

    public static int diameterOfBinaryTree(TreeNode root) {
        maxHeight(root);
        return diameter;
    }

    private static int maxHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftMaxHeight = maxHeight(root.left);
            int rightMaxHeight = maxHeight(root.right);
            int curDiameter = leftMaxHeight + rightMaxHeight;
            if (diameter < curDiameter) {
                diameter = curDiameter;
            }
            return (leftMaxHeight > rightMaxHeight ? leftMaxHeight : rightMaxHeight) + 1;
        }
    }
}