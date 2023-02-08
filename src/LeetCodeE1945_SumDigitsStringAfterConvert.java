import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
 */
public class LeetCodeE1945_SumDigitsStringAfterConvert {

    public int getLucky(String s, int k) {
        String convert = convert(s);
        for (int i = 0; i < k; i++) {
            convert = sumDigits(convert);
        }
        return Integer.parseInt(convert);
    }

    private String sumDigits(String s) {
        return String.valueOf(s.chars().map(Character::getNumericValue).sum());
    }

    private String convert(String s) {
        return s.chars()
                .mapToObj(c -> getAlphabetPostiion((char) c))
                .map(String::valueOf).collect(Collectors.joining());
    }

    private int getAlphabetPostiion(char c) {
        return c - 96; //'a' letter ASCII = 97
    }

}




