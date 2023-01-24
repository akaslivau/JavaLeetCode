import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/equal-row-and-column-pairs/
 */
public class LeetCodeM2352_MatrixRowColumnEquals {

    public int equalPairs(int[][] grid) {
        List<String> rows = new LinkedList<>();
        for (int[] row : grid) {
            String str = Arrays.stream(row).mapToObj(String::valueOf).collect(Collectors.joining("_"));
            rows.add(str);
        }

        int n = grid.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[j][i]);
                if (j != n - 1)
                    sb.append("_");
            }
            String column = sb.toString();
            res += rows.stream().filter(x -> x.contains(column)).count();
        }

        return res;
    }


}




