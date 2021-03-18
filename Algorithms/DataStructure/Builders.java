package DataStructure;

/**
 * @author holten
 */
public class Builders {
    public static TreeNode buildTree(TreeNode root, int index, Integer[] nums) {
        if (2 * index + 2 > nums.length) {
            return root;
        }
        if (nums[2 * index + 1] != null) {
            root.left = buildTree(new TreeNode(nums[2 * index + 1]), 2 * index + 1, nums);
        }
        if (nums[2 * index + 2] != null) {
            root.right = buildTree(new TreeNode(nums[2 * index + 2]), 2 * index + 2, nums);
        }
        return root;
    }

    public static ListNode buildList(int[] nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for (int i = 1; i < nums.length; i++) {
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
        return head;
    }
}
