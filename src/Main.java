import ru.main.trees.TreeNode;

public class Main {
    public static void main(String[] args) {
        Integer[] data = new Integer[]{1, 2, 2, 3, null, null, 3, 4, null, null, 4};
        TreeNode node = TreeNode.valueOf(data);

        LeetCode110 test = new LeetCode110();
        test.isBalanced(node);
    }
}


