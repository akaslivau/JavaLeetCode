import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/***
 * https://leetcode.com/problems/deepest-leaves-sum/
 */
public class LeetCodeM1302_DeepestLeavesSum {

  public static void main(String[] args) {
    TreeNode tree = TreeNode.valueOf(
        new Integer[]{1,
            2, 3,
            4, 5, null, 6,
            7, null, null, null, null, 8});
    System.out.println(deepestLeavesSum(tree));
  }

  public static int deepestLeavesSum(TreeNode root) {
    int sum = 0;
    Queue<TreeNode> children = new LinkedList<>();
    children.add(root);

    while (!children.isEmpty()) {
      sum = process(children);
    }
    return sum;
  }

  private static int process(Queue<TreeNode> queue) {
    List<TreeNode> prevs = new ArrayList<>();
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      prevs.add(node);
    }
    boolean noChildren = prevs.stream().allMatch(x -> noChildren(x));
    if (noChildren) {
      return prevs.stream().map(x -> x.val).reduce(0, Integer::sum);
    }

    prevs.forEach(p -> {
      if (p.left != null) {
        queue.add(p.left);
      }
      if (p.right != null) {
        queue.add(p.right);
      }
    });
    return -1;
  }

  private static boolean noChildren(TreeNode node) {
    return node.left == null && node.right == null;
  }

}




