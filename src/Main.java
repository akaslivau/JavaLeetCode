import java.util.List;

public class Main {
    public static void main(String[] args) {
        LeetCodeE94_TreeInorderTraversal c = new LeetCodeE94_TreeInorderTraversal();
        List<Integer> res = c.inorderTraversal(TreeNode.valueOf(new Integer[]{1, 2,3,4,5,6,7,8,9}));
        PrintUtils.printList(res);
    }
}


