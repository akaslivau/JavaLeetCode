/***
 * https://leetcode.com/problems/remove-all-occurrences-of-a-substring/
 */
public class LeetCodeM1910_RemoveAllOccurrences {
    public String removeOccurrences(String s, String part) {
        String res = s;
        while (res.contains(part)) {
            res = removeFirstOccurrence(res, part);
        }
        return res;
    }

    private String removeFirstOccurrence(String s, String part) {
        int index = s.indexOf(part);
        return s.substring(0, index) + s.substring(index + part.length());
    }


}




