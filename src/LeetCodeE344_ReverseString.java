/***
 * https://leetcode.com/problems/reverse-string/
 */
public class LeetCodeE344_ReverseString {

    public void reverseString(char[] s) {
        int n = s.length;
        int half = n / 2;
        for (int i = 0; i < half; i++) {
            char tmp = s[i];
            int mirrorIndex = n - i - 1;
            s[i] = s[mirrorIndex];
            s[mirrorIndex] = tmp;
        }
    }

}




