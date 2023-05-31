import java.util.ArrayList;
import java.util.Collections;
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
    preorderHelper(root, res);
    return res;
  }

  private void preorderHelper(TreeNode root, List<Integer> res) {
    if (root == null) {
      return;
    }
    res.add(root.val);
    preorderHelper(root.left, res);
    preorderHelper(root.right, res);
  }

  public List<Integer> preorderStackTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) {
      return res;
    }

    Stack<TreeNode> s = new Stack<>();
    s.push(root);

    while (!s.isEmpty()) {
      TreeNode v = s.pop();
      res.add(v.val);
      if (v.right != null) {
        s.push(v.right);
      }
      if (v.left != null) {
        s.push(v.left);
      }
    }
    return res;
  }

  public List<Integer> postorderStackTraversal(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    if (root == null) {
      return ans;
    }

    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode cur = stack.pop();
      ans.add(cur.val);

      if (cur.left != null) {
        stack.push(cur.left);
      }
      if (cur.right != null) {
        stack.push(cur.right);
      }
    }
    Collections.reverse(ans);
    return ans;
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




