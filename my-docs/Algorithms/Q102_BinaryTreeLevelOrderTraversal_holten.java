/**
* Created by holten on 2016-06-29.
* Email: holten.ko@gmail.com
*/

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Q102_BinaryTreeLevelOrderTraversal_holten {
    List<List<Integer>> returnList=new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        find(root,0);
        return returnList;
    }
    public void find(TreeNode root,int level){
        if(root==null){
            return;
        }
        if(returnList.size() >= level+1){
            List<Integer> l = returnList.get(level);
            l.add(root.val);
        }else{
            List<Integer> temp  = new ArrayList<Integer>();
            temp.add(root.val);
            returnList.add(level,temp);
        }
        //go left and right
        find(root.left,level+1);
        find(root.right,level+1);
    }
}
