import DataStructure.Builders;
import DataStructure.ListNode;
import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author holten
 * @date 2021/3/26
 */
class Q21_MergeTwoSortedLists {
    public static void main(String[] args) {
        int[] ints1 = {1, 2, 4};
        ListNode list1 = Builders.buildList(ints1);
        int[] ints2 = {1, 3, 4};
        ListNode list2 = Builders.buildList(ints2);
        System.out.println(mergeTwoLists(null, list2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (node1 != null && node2 != null) {
            if (node1.val > node2.val) {
                cur.next = node2;
                node2 = node2.next;
            } else {
                cur.next = node1;
                node1 = node1.next;
            }
            cur = cur.next;
        }
        if (node1 == null) {
            cur.next = node2;
        }
        if (node2 == null) {
            cur.next = node1;
        }
        return head.next;
    }
}