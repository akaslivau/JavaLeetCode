import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
 */
public class LeetCodeM2125_BankLaserBeams {

  public static void main(String[] args) {
    String[] s = {"011001", "000000", "010100", "001000"};
    System.out.println(numberOfBeams(s));
  }

  public static int numberOfBeams(String[] bank) {
    List<Long> longs = Arrays.stream(bank)
        .map(x -> countOnes(x))
        .filter(x -> x > 0)
        .collect(Collectors.toList());
    int res = 0;
    for (int i = 1; i < longs.size(); i++) {
      res += longs.get(i - 1) * longs.get(i);
    }
    return res;
  }

  private static long countOnes(String s) {
    return s.chars().filter(x -> x == 49).count();
  }

}




