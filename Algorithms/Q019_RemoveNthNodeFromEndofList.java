/**
* Created by holten on 2016-07-07.
* Email: holten.ko@gmail.com
*/

import DataStructure.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Q019_RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode node1 = head;
		ListNode node2 = head;
		for (int i = 0; i < n; i++) {
			node2 = node2.next;
		}
		if(node2==null) return node1.next;
		while (node2.next != null) {
			node1 = node1.next;
			node2 = node2.next;
		}
		node1.next = node1.next.next;
		return head;
    }
}