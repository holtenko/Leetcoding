/**
* Created by holten on 2016-07-04.
* Email: holten.ko@gmail.com
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) return true;
        if ((p == null && q != null) || (p != null && q == null) || (p.val != q.val)) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}