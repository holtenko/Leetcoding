import DataStructure.ListNode;
import DataStructure.TreeNode;

/**
 * @author holten
 * @date 2021/2/28
 */
class Q1367_LinkedListinBinaryTree {
    public static void main(String[] args) {
        ListNode head = null;
        TreeNode root = null;
        System.out.println(isSubPath(head, root));
    }

    public static boolean isSubPath(ListNode head, TreeNode root) {
        ListNode checkNode = head;
        TreeNode node = root;
        boolean isAllMatch = false;
        boolean isStartMatch = false;
        traversal(head, node, checkNode, isAllMatch, isStartMatch);
        return isAllMatch;
    }

    private static void traversal(ListNode head, TreeNode node, ListNode checkNode, boolean isAllMatch, boolean isStartMatch) {
        if (isAllMatch) {
            return;
        }
        if (node == null) {
            isStartMatch = false;
            checkNode = head;
            return;
        }
        if (node.val == checkNode.val) {
            isStartMatch = true;
            checkNode = checkNode.next;
        } else {
            isStartMatch=false;

        }
    }
}