/***
 * https://leetcode.com/problems/rotate-image/
 */
public class LeetCodeM48_RotateImage {

    public void rotate(int[][] m) {
        int n = m.length;
        int depth = n / 2;

        transpose(m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < depth; j++) {
                int tmp = m[i][j];
                m[i][j] = m[i][n - j - 1];
                m[i][n - j - 1] = tmp;
            }
        }
    }

    private static void transpose(int[][] m) {
        int n = m.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = tmp;
            }
        }
    }
}




