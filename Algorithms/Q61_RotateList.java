import DataStructure.Builders;
import DataStructure.ListNode;

/**
 * @author holten
 * @date 2021/3/27
 */
class Q61_RotateList {
    public static void main(String[] args) {
        int[] ints1 = {1, 2, 3, 4, 5};
        ListNode head = Builders.buildList(ints1);
        System.out.println(rotateRight(head, 2));
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode newHead = slow.next;
        fast.next = head;
        slow.next = null;
        return newHead;
    }
}