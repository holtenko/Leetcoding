import DataStructure.Builders;
import DataStructure.ListNode;
import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q2_AddTwoNumbers {
    public static void main(String[] args) {
        int[] nums1 = {9,9,9,9,9,9,9};
        int[] nums2 = {9,9,9,9};
        ListNode l1 = Builders.buildList(nums1);
        ListNode l2 = Builders.buildList(nums2);
        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add = 0;
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode preHead = new ListNode(0);
        ListNode cur = preHead;

        while (node1 != null || node2 != null) {
            int val = add;
            if (node1 != null) {
                val += node1.val;
                node1 = node1.next;
            }
            if (node2 != null) {
                val += node2.val;
                node2 = node2.next;
            }
            add = val / 10;
            cur.next = new ListNode(val % 10);
            cur = cur.next;
        }
        if (add > 0) {
            cur.next = new ListNode(add);
        }
        return preHead.next;
    }
}