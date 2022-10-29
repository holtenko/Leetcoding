/**
* Created by holten on 2016-07-04.
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
public class Q237_DeleteNodeinaLinkedList_holten {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next= node.next.next;
    }
}