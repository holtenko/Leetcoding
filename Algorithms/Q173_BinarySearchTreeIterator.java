import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/3/28
 */
class Q173_BinarySearchTreeIterator {
    public static void main(String[] args) {
        Integer[] list = {1};
        TreeNode root = new TreeNode(list[0]);

        BSTIterator obj = new BSTIterator(root);
        int param_1 = obj.next();
        boolean param_2 = obj.hasNext();
    }

    static class BSTIterator {
        int curIndex;
        List<Integer> list;

        public BSTIterator(TreeNode root) {
            this.curIndex = 0;
            this.list = new ArrayList<>();
            traversal(root, list);
        }

        public int next() {
            return list.get(curIndex++);
        }

        public boolean hasNext() {
            return curIndex < list.size();
        }

        private void traversal(TreeNode root, List<Integer> list) {
            if (root == null) {
                return;
            }
            traversal(root.left, list);
            list.add(root.val);
            traversal(root.right, list);
        }
    }
}