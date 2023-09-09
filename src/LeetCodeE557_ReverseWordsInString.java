import java.util.Arrays;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class LeetCodeE557_ReverseWordsInString {

  public static void main(String[] args) {
    System.out.println(reverseWords("Let's take LeetCode contest"));
  }

  public static String reverseWords(String s) {
    return Arrays.stream(s.split(" "))
        .map(StringBuilder::new)
        .map(StringBuilder::reverse)
        .map(StringBuilder::toString)
        .collect(Collectors.joining(" "));
  }

}




