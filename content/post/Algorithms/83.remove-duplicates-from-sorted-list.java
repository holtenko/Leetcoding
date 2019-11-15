/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 *
 * algorithms
 * Easy (41.94%)
 * Total Accepted:    305.4K
 * Total Submissions: 727.5K
 * Testcase Example:  '[1,1,2]'
 *
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * Example 1:
 * 
 * 
 * Input: 1->1->2
 * Output: 1->2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 * 
 * 
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next == null) {
            return head;
        }
        ListNode now = head;
        while (now.next != null) {
            if (now.val == now.next.val) {
                if (now.next.next == null) {
                    now.next = null;
                } else {
                    now.next = now.next.next;
                }
            }else{
                now = now.next;
            }
        }
        return head;
    }
}
