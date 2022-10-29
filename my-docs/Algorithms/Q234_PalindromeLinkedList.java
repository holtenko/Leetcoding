import DataStructure.Builders;
import DataStructure.ListNode;

import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q234_PalindromeLinkedList {
    public static void main(String[] args) {
        int[] ints1 = {1, 2, 3, 2, 1};
        ListNode head = Builders.buildList(ints1);
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            int curInt = stack.pop();
            if (cur.val != curInt) {
                return false;
            }
            cur = cur.next;
        }
        return true;
    }
}