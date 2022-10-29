import DataStructure.Builders;
import DataStructure.ListNode;

import java.util.*;

/**
 * @author holten
 * @date 2021/4/24
 */
class Q143_ReorderList {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = Builders.buildList(nums);
        reorderList(head);
    }

    public static void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Queue<ListNode> queue = new LinkedList<>();
        queue.add(head);
        while (fast.next != null) {
            fast = fast.next;
            if (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
                queue.add(slow);
            }
        }
        Stack<ListNode> stack = new Stack<>();
        while (slow != null) {
            if (slow.next != null) {
                stack.push(slow.next);
            }
            slow = slow.next;
        }
        ListNode preHead = new ListNode(0);
        ListNode node = preHead;
        while (!queue.isEmpty() || !stack.isEmpty()) {
            node.next = queue.poll();
            node = node.next;
            if (!stack.isEmpty()) {
                node.next = stack.pop();
                node = node.next;
            }
        }
        node.next = null;
        head = preHead.next;
    }

}