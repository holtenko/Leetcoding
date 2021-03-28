import DataStructure.Builders;
import DataStructure.ListNode;

import java.util.Stack;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q92_ReverseLinkedListII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = Builders.buildList(nums);
        System.out.println(reverseBetween(head, 1, 1));
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        int index = 1;
        Stack<ListNode> stack = new Stack<>();
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode cur = head;
        ListNode pre = preHead;
        ListNode tail = null;
        while (cur != null) {
            if (index >= left && index <= right) {
                stack.push(cur);
            } else if (index < left) {
                pre = pre.next;
            } else if (index == right + 1) {
                tail = cur;
            }
            cur = cur.next;
            index++;
        }

        while (!stack.isEmpty()) {
            pre.next = stack.pop();
            pre = pre.next;
        }
        if (pre != null) {
            pre.next = tail;
        }
        return preHead.next;
    }
}