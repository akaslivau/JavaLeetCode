/***
 * https://leetcode.com/problems/add-two-numbers/
 */
public class LeetCodeM2_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode res = null;

        int extra = 0;
        ListNode n1 = a;
        ListNode n2 = b;

        ListNode cur = null;
        while (n1 != null || n2 != null || extra > 0) {
            int sum = extra + (n1 == null ? 0 : n1.val) + (n2 == null ? 0 : n2.val);

            int val = sum % 10;

            if (res == null) {
                res = new ListNode(val);
                cur = res;
            } else {
                cur.next = new ListNode(val);
                cur = cur.next;
            }

            extra = sum / 10;
            n1 = n1 == null ? null : n1.next;
            n2 = n2 == null ? null : n2.next;
        }

        return res;
    }
}




