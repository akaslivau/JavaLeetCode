import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/***
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class TreeTraversal {

  public List<Integer> inorderTraversal(TreeNode root) {
    if (root == null) {
      return new ArrayList<>();
    }

    List<Integer> res = new ArrayList<>();

    Stack<TreeNode> stack = new Stack<>();
    TreeNode cur = root;

    while (cur != null || !stack.isEmpty()) {
      while (cur != null) {
        stack.push(cur);
        cur = cur.left;
      }
      cur = stack.pop();
      res.add(cur.val);
      cur = cur.right;
    }
    return res;
  }

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    traversal(root, res);
    return res;
  }

  private void traversal(TreeNode root, List<Integer> res) {
    if (root == null) {
      return;
    }
    res.add(root.val);
    traversal(root.left, res);
    traversal(root.right, res);
  }

  private static void traversePostOrder(TreeNode node, List<Integer> result) {
    if (node == null) {
      return;
    }
    if (node.left != null) {
      traversePostOrder(node.left, result);
    }
    if (node.right != null) {
      traversePostOrder(node.right, result);
    }
    result.add(node.val);
  }

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    traversePostOrder(root, result);
    return result;
  }

}




