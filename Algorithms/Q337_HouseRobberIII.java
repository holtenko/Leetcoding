import DataStructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

import static DataStructure.Builders.buildTree;

/**
 * Created by holten on 2020-12-26.
 * Email: holten.ko@foxmail.com
 */

class Q337_HouseRobberIII {
    public static void main(String[] args) {
        Q337_HouseRobberIII q337HouseRobberIII = new Q337_HouseRobberIII();
        Integer[] nums = {3, 4, 5, 1, 3, null, 1};
        TreeNode root = buildTree(new TreeNode(nums[0]), 0, nums);
        System.out.println(q337HouseRobberIII.rob(root));
    }

    Map<TreeNode, Integer> maxMap = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (maxMap.containsKey(root)) {
            return maxMap.get(root);
        }
        int robIt = root.val
                + (root.left == null ? 0 : (rob(root.left.left) + rob(root.left.right)))
                + (root.right == null ? 0 : (rob(root.right.left) + rob(root.right.right)));

        int notRobIt = rob(root.left) + rob(root.right);
        int max = Math.max(robIt, notRobIt);
        maxMap.put(root, max);
        return max;
    }
}