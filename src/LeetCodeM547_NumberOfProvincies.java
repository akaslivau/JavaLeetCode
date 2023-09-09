/***
 * https://leetcode.com/problems/number-of-provinces/description/
 */
public class LeetCodeM547_NumberOfProvincies {


  public int findCircleNum(int[][] a) {
    int n = a.length;
    boolean[] visitedRows = new boolean[n];

    int res = 0;
    for (int row = 0; row < n; row++) {
      if (!visitedRows[row]) {
        visit(a, row, visitedRows);
        res++;
      }
    }
    return res;
  }

  private static void visit(int[][] a, int row, boolean[] visitedRows) {
    int n = a.length;

    for (int col = 0; col < n; col++) {
      if (col == row) {
        continue;
      }
      if (a[row][col] == 1 && !visitedRows[col]) {
        visitedRows[col] = true;
        visit(a, col, visitedRows);
      }
    }
  }


}




