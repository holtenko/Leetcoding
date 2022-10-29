/**
* Created by holten on 2016-07-04.
* Email: holten.ko@gmail.com
*/

import DataStructure.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Q226_InvertBinaryTree_holten {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
    }
}