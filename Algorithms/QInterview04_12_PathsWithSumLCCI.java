import DataStructure.TreeNode;

import java.util.HashSet;

/**
 * @author holten
 * @date 2021/3/10
 */
class QInterview04_12_PathsWithSumLCCI {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = null;
        node1.right = node2;
        node2.left = null;
        node2.right = node3;
        node3.left = null;
        node3.right = node4;
        node4.left = null;
        node4.right = node5;
        int sum = 3;
        System.out.println(pathSum(node1, sum));
    }

    private static int count = 0;
    private static HashSet<TreeNode> visited = new HashSet<>();

    public static int pathSum(TreeNode root, int sum) {
        sum(root, 0, sum, true);
        return count;
    }

    private static void sum(TreeNode root, int preSum, int sum, boolean isRoot) {
        if (root == null) {
            return;
        }
        if (isRoot) {
            if (visited.contains(root)) {
                return;
            } else {
                visited.add(root);
            }
        }
        int curSum = preSum + root.val;
        if (curSum == sum) {
            count++;
        }
        sum(root.left, curSum, sum, false);
        sum(root.right, curSum, sum, false);
        sum(root.left, 0, sum, true);
        sum(root.right, 0, sum, true);
    }
}