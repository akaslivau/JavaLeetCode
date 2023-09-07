import java.util.Arrays;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/calculate-digit-sum-of-a-string/
 */
public class LeetCodeE2243_StringDigitSum {

  public static void main(String[] args) {
    System.out.println(digitSum("11111222223", 3));
  }

  public static String digitSum(String s, int k) {
    String[] parts = toParts(s, k);

    while (parts.length > 1) {
      s = Arrays.stream(parts).map(x -> sum(x)).collect(Collectors.joining());
      parts = toParts(s, k);
    }

    return parts[0];
  }

  private static String[] toParts(String s, int partLen) {
    return s.split("(?<=\\G.{" + partLen + "})");
  }

  private static String sum(String s) {
    return s.codePoints()
        .mapToObj(c -> String.valueOf((char) c))
        .map(Integer::parseInt)
        .reduce(0, Integer::sum)
        .toString();
  }
}




