import DataStructure.ListNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import static DataStructure.Builders.buildList;

public class Q92_ReverseLinkedListII {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        ListNode head = buildList(list);
        ListNode result = reverseBetween(head, 2, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        int pos = 0;
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode pre = preHead;
        ListNode next = preHead;
        ListNode cur = preHead;
        Stack<ListNode> stack = new Stack<>();

        while (cur != null) {
            if (pos + 1 == left) {
                pre = cur;
            }
            if (pos == right) {
                next = cur.next;
            }
            if (pos >= left && pos <= right) {
                stack.push(cur);
            }
            cur = cur.next;
            pos++;
        }
        while (!stack.isEmpty()) {
            pre.next = stack.pop();
            pre = pre.next;
        }
        pre.next = next;
        return preHead.next;
    }
}