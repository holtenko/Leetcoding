import DataStructure.Builders;
import DataStructure.TreeNode;

/**
 * @author holten
 * @date 2021/3/26
 */
class Q124_BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        Integer[] list = {1};
        TreeNode root = new TreeNode(list[0]);
        Builders.buildTree(root, 0, list);
        System.out.println(maxPathSum(null));
    }

    private static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        max(root);
        return maxSum;
    }

    private static int max(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = Math.max(max(root.left), 0);
        int rightMax = Math.max(max(root.right), 0);

        int sum = root.val + leftMax + rightMax;
        maxSum = Math.max(maxSum, sum);
        return root.val + Math.max(leftMax, rightMax);
    }
}