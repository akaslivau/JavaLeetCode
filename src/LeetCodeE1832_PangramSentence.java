import java.util.Arrays;

/***
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 */
public class LeetCodeE1832_PangramSentence {

    public boolean checkIfPangram(String sentence) {
        return sentence.chars().distinct().count() == 26L;
    }

}




