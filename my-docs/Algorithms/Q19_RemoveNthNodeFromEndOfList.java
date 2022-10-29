import DataStructure.Builders;
import DataStructure.ListNode;
import DataStructure.Printer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author holten
 * @date 2021/4/24
 */
class Q19_RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = Builders.buildList(nums);
        Printer.printList(removeNthFromEnd(head, 5));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode slow = dummyHead;
        ListNode fast = dummyHead;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummyHead.next;
    }

}