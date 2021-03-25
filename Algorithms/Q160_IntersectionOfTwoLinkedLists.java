import DataStructure.Builders;
import DataStructure.ListNode;

import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q160_IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        int[] numsA = {4, 1, 8, 4, 5};
        int[] numsB = {5, 6, 1, 8, 4, 5};
        ListNode headA = Builders.buildList(numsA);
        ListNode headB = Builders.buildList(numsB);
        System.out.println(getIntersectionNode(headA, headB));
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();
        ListNode a = headA;
        ListNode b = headB;
        while (a != null) {
            stackA.push(a);
            a = a.next;
        }
        while (b != null) {
            stackB.push(b);
            b = b.next;
        }
        ListNode interNode = null;
        while (!stackA.isEmpty() && !stackB.isEmpty()) {
            ListNode nodeA = stackA.pop();
            ListNode nodeB = stackB.pop();
            if (nodeA.equals(nodeB)) {
                interNode = nodeA;
            } else {
                break;
            }
        }
        return interNode;
    }

}