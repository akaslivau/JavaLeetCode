public class Main {
    public static void main(String[] args) {
        LeetCodeM2_AddTwoNumbers c = new LeetCodeM2_AddTwoNumbers();

        ListNode a = ListNode.fromArray(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode b = ListNode.fromArray(new int[]{9, 9, 9, 9});
        ListNode res = c.addTwoNumbers(a, b);
        System.out.println(res);
    }
}


