public class Main {
    public static void main(String[] args) {
        LeetCodeM24_SwapNodes c = new LeetCodeM24_SwapNodes();

        ListNode a = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
        ListNode res = c.swapPairs(a);
        System.out.println(res);
    }
}


