import DataStructure.ListNode;

/**
 * @author holten
 * @date 2021/3/8
 */
class Q82_RemoveDuplicatesFromSortedListII {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        System.out.println(deleteDuplicates(head).val);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode beforeHead = new ListNode(0);
        beforeHead.next = head;
        ListNode preNode = beforeHead;
        ListNode currentNode = head;
        boolean isDup = false;
        while (currentNode != null) {
            if (currentNode.next != null && currentNode.val == currentNode.next.val) {
                isDup = true;
            } else {
                if (isDup) {
                    preNode.next = currentNode.next;
                } else {
                    preNode = currentNode;
                }
                isDup = false;
            }
            currentNode = currentNode.next;
        }
        return beforeHead.next;
    }
}