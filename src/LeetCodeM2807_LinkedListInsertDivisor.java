/***
 * https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
 */
public class LeetCodeM2807_LinkedListInsertDivisor {

  public static void main(String[] args) {
    ListNode node = ListNode.fromArray(new int[]{18, 6, 10, 3});
    ListNode res = insertGreatestCommonDivisors(node);
    PrintUtils.print(res);
  }

  public static ListNode insertGreatestCommonDivisors(ListNode head) {
    ListNode cur = head;
    while (cur.next != null) {
      int a = cur.val;
      int b = cur.next.val;
      cur.next = new ListNode(gcd(a, b), cur.next);
      cur = cur.next.next;
    }

    return head;
  }

  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }


}




