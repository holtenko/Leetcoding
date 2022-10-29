import DataStructure.Builders;
import DataStructure.ListNode;

import java.util.List;
import java.util.Stack;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q23_MergeKSortedLists {
    public static void main(String[] args) {
        int[] nums1 = {1, 4, 5};
        int[] nums2 = {1, 3, 4};
        int[] nums3 = {2, 6};
        ListNode head1 = Builders.buildList(nums1);
        ListNode head2 = Builders.buildList(nums2);
        ListNode head3 = Builders.buildList(nums3);
        ListNode[] heads = {head1, head2, head3};
        System.out.println(mergeKLists(heads));
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len < 1) {
            return null;
        }
        if (len == 1) {
            return lists[0];
        }
        ListNode[] curNodes = new ListNode[len];
        System.arraycopy(lists, 0, curNodes, 0, len);

        ListNode preHead = new ListNode(0);
        ListNode cur = preHead;

        boolean allEmpty = false;
        while (!allEmpty) {
            int minIndex = -1;
            int minVal = Integer.MAX_VALUE;
            for (int i = 0; i < len; i++) {
                ListNode node = curNodes[i];
                if (node != null && node.val < minVal) {
                    minIndex = i;
                    minVal = node.val;
                }
            }
            if (minIndex < 0) {
                allEmpty = true;
            } else {
                cur.next = curNodes[minIndex];
                cur = cur.next;
                curNodes[minIndex] = curNodes[minIndex].next;
            }
        }
        return preHead.next;
    }
}