/**
* Created by holten on 2016-07-18.
* Email: holten.ko@gmail.com
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode first=head;
        ListNode second=head.next;
        ListNode previous=dummy;
        while(second!=null){
            previous.next=second;
            first.next=second.next;
            second.next=first;
            first=first.next;
            second=(first!=null&&first.next!=null)?first.next:null;
            previous=previous.next.next;
        }
        return dummy.next;
    }
}