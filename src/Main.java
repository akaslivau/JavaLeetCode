import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeTraversal c = new TreeTraversal();
        TreeNode treeNode = TreeNode.valueOf(new Integer[]{1, 2, 3, 4, 5, 6});

        System.out.println("Inorder");
        PrintUtils.print(c.inorderTraversal(treeNode));

        System.out.println("Preorder");
        PrintUtils.print(c.preorderTraversal(treeNode));

        System.out.println("Postorder");
        PrintUtils.print(c.postorderTraversal(treeNode));
    }
}


