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
class Q83_RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        ListNode head = Builders.buildList(nums);
        Printer.printList(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

}