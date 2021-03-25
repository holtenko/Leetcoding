import DataStructure.Builders;
import DataStructure.ListNode;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q82_RemoveDuplicatesFromSortedListII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        ListNode head = Builders.buildList(nums);
        System.out.println(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preHead = new ListNode(head.val - 1);
        preHead.next = head;
        ListNode pre = preHead;
        ListNode cur = head;
        boolean isDup = false;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                isDup = true;
            } else {
                if (isDup) {
                    pre.next = cur.next;
                } else {
                    pre = cur;
                }
                isDup = false;
            }
            cur = cur.next;
        }
        return preHead.next;
    }

}