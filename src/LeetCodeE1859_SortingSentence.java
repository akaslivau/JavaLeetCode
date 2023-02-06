import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/sorting-the-sentence/
 */
public class LeetCodeE1859_SortingSentence {

    public static final String SPACE = " ";

    public String sortSentence(String s) {
        return Arrays.stream(s.split(SPACE))
                .sorted(Comparator.comparingInt(a -> Integer.parseInt(a.substring(a.length() - 1))))
                .map(x -> x.substring(0,x.length() - 1)).collect(Collectors.joining(SPACE));
    }

}




