import java.util.Arrays;

/***
 * https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/
 */
public class LeetCodeE2496_MaximumValueStringArray {

    public int maximumValue(String[] strs) {
        return Arrays.stream(strs).map(this::maxLength).mapToInt(a -> a).max().orElse(-1);
    }

    private Integer maxLength(String s) {
        boolean onlyDigits = s.chars().mapToObj(x -> (char) x).allMatch(Character::isDigit);
        return onlyDigits ? Integer.parseInt(s) : s.length();
    }

}




