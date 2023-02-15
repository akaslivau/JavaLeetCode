import java.util.Arrays;

/***
 * https://leetcode.com/problems/find-the-difference/
 */
public class LeetCodeE389_FindtheDifference {

    public char findTheDifference(String s, String t) {
        if (s.length() == 0)
            return t.charAt(0);

        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);

        int n = sChars.length;
        for (int i = 0; i < n; i++) {
            if (sChars[i] != tChars[i])
                return tChars[i];
        }
        return tChars[n];
    }

}




