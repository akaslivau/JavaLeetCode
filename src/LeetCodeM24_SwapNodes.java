/***
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class LeetCodeM24_SwapNodes {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode next = head.next;
        head.next = swapPairs(head.next.next);
        next.next = head;

        return next;
    }
}




