/**
* Created by holten on 2016-06-29.
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
public class Q328_OddEvenLinkedList_holten {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode evenHead=head.next;
        ListNode odd=head;
        ListNode even=evenHead;

        while(odd.next!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
