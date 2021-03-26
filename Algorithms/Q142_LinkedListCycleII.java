import DataStructure.ListNode;

/**
 * @author holten
 * @date 2021/3/26
 */
class Q142_LinkedListCycleII {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head2;
        System.out.println(detectCycle(head));
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        do {
            slow = slow.next;
            if (slow == null) {
                return null;
            }
            fast = fast.next;
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            if (fast == null) {
                return null;
            }
        } while (!slow.equals(fast));
        fast = head;
        while (!slow.equals(fast)) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}