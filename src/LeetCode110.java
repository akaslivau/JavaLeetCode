/***
 * https://leetcode.com/problems/same-tree/
 */
public class LeetCode110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        int leftHeight = getSubtreeHeight(root.left);
        int rightHeight = getSubtreeHeight(root.right);


        boolean balanced = Math.abs(leftHeight - rightHeight) < 2;
        return balanced && (isBalanced(root.left) && isBalanced(root.right));
    }

    public int getSubtreeHeight(TreeNode r) {
        if (r == null)
            return 0;
        return 1 + Math.max(getSubtreeHeight(r.left), getSubtreeHeight(r.right));
    }
}




