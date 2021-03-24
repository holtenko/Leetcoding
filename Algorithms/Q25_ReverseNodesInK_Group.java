import DataStructure.Builders;
import DataStructure.ListNode;

import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/23
 */
class Q25_ReverseNodesInK_Group {
    public static void main(String[] args) {
        int[] list = {1};
        ListNode head = Builders.buildList(list);
        ListNode newHead = reverseKGroup(head, 3);
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode preTail = preHead;
        ListNode curNode = head;
        ListNode nextNode;
        Stack<ListNode> kStack = new Stack<>();
        while (curNode != null) {
            kStack.push(curNode);
            nextNode = curNode.next;
            if (kStack.size() == k) {
                while (!kStack.isEmpty()) {
                    preTail.next = kStack.pop();
                    preTail = preTail.next;
                }
                preTail.next = nextNode;
                curNode = nextNode;
            } else {
                curNode = curNode.next;
            }
        }
        if (!kStack.isEmpty()) {
            Stack<ListNode> kStackReverse = new Stack<>();
            while (!kStack.isEmpty()) {
                kStackReverse.push(kStack.pop());
            }
            while (!kStackReverse.isEmpty()) {
                preTail.next = kStackReverse.pop();
                preTail = preTail.next;
            }
        }
        return preHead.next;
    }
}