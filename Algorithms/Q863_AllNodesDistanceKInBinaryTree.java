import DataStructure.Builders;
import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author holten
 * @date 2021/3/16
 */
class Q863_AllNodesDistanceKInBinaryTree {
    public static void main(String[] args) {
        Integer[] tree = {3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        TreeNode root = new TreeNode(tree[0]);
        Builders.buildTree(root, 0, tree);

        System.out.println(distanceK(root, root.left, 2));
    }

    public static List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> result = new ArrayList<>();
        Map<TreeNode, TreeNode> nodeParent = new HashMap<>();
        addParent(nodeParent, root, null);
        Set<TreeNode> visited = new HashSet<>();
        addK(result, target, nodeParent, 0, K, visited);
        return result;
    }

    private static void addParent(Map<TreeNode, TreeNode> nodeParent, TreeNode node, TreeNode parent) {
        if (node == null) {
            return;
        }
        nodeParent.put(node, parent);
        addParent(nodeParent, node.left, node);
        addParent(nodeParent, node.right, node);
    }

    private static void addK(List<Integer> result, TreeNode root, Map<TreeNode, TreeNode> nodeParent, int curDepth, int depth, Set<TreeNode> visited) {
        if (root == null || visited.contains(root)) {
            return;
        }
        visited.add(root);
        if (curDepth == depth) {
            result.add(root.val);
            return;
        }
        addK(result, nodeParent.get(root), nodeParent, curDepth + 1, depth, visited);
        addK(result, root.left, nodeParent, curDepth + 1, depth, visited);
        addK(result, root.right, nodeParent, curDepth + 1, depth, visited);
    }
}