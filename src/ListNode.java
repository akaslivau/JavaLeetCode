import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode fromArray(int[] array) {
        LinkedList<ListNode> nodes = Arrays.stream(array).mapToObj(x -> new ListNode(x)).collect(Collectors.toCollection(LinkedList::new));

        for (int i = 0; i < nodes.size() - 1; i++) {
            ListNode cur = nodes.get(i);
            cur.next = nodes.get(i + 1);
        }

        return nodes.get(0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            sb.append(cur.val);
            cur = cur.next;
            if(cur != null){
                sb.append(" -> ");
            }
        }
        return sb.toString();
    }
}
