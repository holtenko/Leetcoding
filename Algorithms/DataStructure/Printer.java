package DataStructure;

/**
 * @author holten
 */
public class Printer {
    public static void printList(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + ", ");
            node = node.next;
        }
    }
}
