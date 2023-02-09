/***
 * https://leetcode.com/problems/circular-sentence/
 */
public class LeetCodeE2490_CircularSentence {

    public static final String SPACE = " ";

    public boolean isCircularSentence(String sentence) {
        if (!sentence.substring(0, 1).equals(sentence.substring(sentence.length() - 1)))
            return false;

        String[] strings = sentence.split(SPACE);
        if (strings.length == 1)
            return true;
        String last = strings[0];

        for (int i = 1; i < strings.length; i++) {
            String cur = strings[i];
            String start = cur.substring(0, 1);
            String end = last.substring(last.length() - 1);
            if (!end.equals(start))
                return false;

            last = cur;
        }

        return true;
    }

}




