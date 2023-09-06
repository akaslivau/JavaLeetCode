import java.util.Set;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/count-the-number-of-consistent-strings/
 */
public class LeetCodeE1684_ConsistentString {

  public static void main(String[] args) {
    System.out.println(countConsistentStrings("abc", new String[]{
        "abc", "d", "a", "b"
    }));
  }

  public static int countConsistentStrings(String allowed, String[] words) {
    Set<Integer> allowedChars = allowed.chars().boxed().collect(Collectors.toSet());

    int consistentCount = 0;
    for (String word : words) {
      boolean isBad = word.chars().boxed().anyMatch(c -> !allowedChars.contains(c));
      if (!isBad) {
        consistentCount++;
      }
    }

    return consistentCount;

  }
}




