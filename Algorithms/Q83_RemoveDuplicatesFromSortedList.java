import DataStructure.Builders;
import DataStructure.ListNode;

/**
 * @author holten
 * @date 2021/3/26
 */
class Q83_RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        int[] list = {1, 1, 1, 2, 3, 3};
        ListNode head = Builders.buildList(list);
        System.out.println(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val != pre.val) {
                pre.next = cur;
                pre = pre.next;
            }
            cur = cur.next;
            if (cur == null) {
                pre.next = null;
            }
        }
        return head;
    }
}