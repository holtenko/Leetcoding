import DataStructure.Builders;
import DataStructure.ListNode;

import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/21
 */
class Q206_ReverseLinkedList {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};
        ListNode head = Builders.buildList(list);
        System.out.println(reverseList(head));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode newHead = stack.pop();
        ListNode cur = newHead;
        while (!stack.isEmpty()) {
            cur.next = stack.pop();
            cur = cur.next;
        }
        cur.next = null;
        return newHead;
    }
}