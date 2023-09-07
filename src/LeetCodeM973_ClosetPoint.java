import java.util.Arrays;
import java.util.Comparator;

/***
 * https://leetcode.com/problems/k-closest-points-to-origin/
 */
public class LeetCodeM973_ClosetPoint {

  public static void main(String[] args) {
    int[][] res = kClosest(new int[][]{
        new int[]{0, 1},
        new int[]{1, 0}
    }, 2);
    PrintUtils.print(res);
  }

  public static int[][] kClosest(int[][] points, int k) {
    return Arrays.stream(points).map(Pnt::new)
        .sorted(Comparator.comparing(a -> a.dist))
        .limit(k)
        .map(Pnt::toArray)
        .toArray(int[][]::new);
  }

  static class Pnt {

    final int x;
    final int y;
    final Double dist;

    Pnt(int[] a) {
      this.x = a[0];
      this.y = a[1];
      this.dist = Math.sqrt(x * x + y * y);
    }

    public int[] toArray() {
      return new int[]{x, y};
    }
  }
}




