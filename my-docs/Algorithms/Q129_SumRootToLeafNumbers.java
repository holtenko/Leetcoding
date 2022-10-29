import DataStructure.Builders;
import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q129_SumRootToLeafNumbers {
    public static void main(String[] args) {
        Integer[] nums = {4, 9, 0, 5, 1};
        TreeNode root = Builders.buildTree(new TreeNode(4), 0, nums);
        System.out.println(sumNumbers(root));
    }

    private static int result = 0;

    public static int sumNumbers(TreeNode root) {
        int preSum = 0;
        traversal(root, preSum);
        return result;
    }


    private static void traversal(TreeNode root, int preSum) {
        if (root == null) {
            return;
        }
        int cur = preSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            result += cur;
            return;
        }
        traversal(root.left, cur);
        traversal(root.right, cur);
    }
}