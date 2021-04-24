import DataStructure.Builders;
import DataStructure.ListNode;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q148_SortList {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 7, 4, 5, 8, 6};
        ListNode head = Builders.buildList(nums);
        System.out.println(sortList(head));
    }

    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return sortList(head, tail);
    }

    private static ListNode sortList(ListNode head, ListNode tail) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != tail) {
            fast = fast.next;
            if (fast != tail) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        ListNode head2 = slow.next;
        slow.next = null;
        tail.next = null;
        ListNode list1 = sortList(head, slow);
        ListNode list2 = sortList(head2, tail);
        return merge(list1, list2);
    }

    private static ListNode merge(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(0);
        ListNode cur = preHead;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                cur.next = list2;
                break;
            }
            if (list2 == null) {
                cur.next = list1;
                break;
            }
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        return preHead.next;
    }
}