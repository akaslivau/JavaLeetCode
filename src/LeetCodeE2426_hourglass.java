/***
 * https://leetcode.com/problems/maximum-sum-of-an-hourglass/
 */
public class LeetCodeE2426_hourglass {

  public static void main(String[] args) {
    int[][] test = new int[][]{
        new int[]{520626, 685427, 788912, 800638, 717251, 683428},
        new int[]{23602, 608915, 697585, 957500, 154778, 209236},
        new int[]{287585, 588801, 818234, 73530, 939116, 252369}
    };

    System.out.println(maxSum(test));
  }


  public static int maxSum(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;

    int max = -1;

    for (int i = 0; i < n - 2; i++) {
      for (int j = 0; j < m - 2; j++) {
        max = Math.max(max, sum(grid, j, i));
      }
    }
    return max;
  }

  static int sum(int[][] grid, int topLeftX, int topLeftY) {
    int top =
        grid[topLeftX][topLeftY] + grid[topLeftX][topLeftY + 1] + grid[topLeftX][topLeftY + 2];
    int middle = grid[topLeftX + 1][topLeftY + 1];
    int bottom =
        grid[topLeftX + 2][topLeftY] + grid[topLeftX + 2][topLeftY + 1] + grid[topLeftX + 2][
            topLeftY + 2];

    return top + middle + bottom;
  }

}




