/***
 * https://leetcode.com/problems/remove-element/
 */
public class LeetCodeE1572_MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        if (n == 1)
            return mat[0][0];

        int left = 0;
        int right = n - 1;

        int sum = 0;
        for (int[] row : mat) {
            int leftTerm = row[left];
            int rightTerm = row[right];

            sum += left == right ? leftTerm : (leftTerm + rightTerm);
            left++;
            right--;
        }
        return sum;
    }

}




