import DataStructure.Builders;
import DataStructure.ListNode;
import DataStructure.Printer;
import DataStructure.TreeNode;

/**
 * @author holten
 * @date 2021/5/12
 */
class Q328_OddEvenLinkedList {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7};
        ListNode list = Builders.buildList(ints);
        Printer.printList(oddEvenList(list));
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode odd = head;
        ListNode even = head.next;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return oddHead;
    }
}