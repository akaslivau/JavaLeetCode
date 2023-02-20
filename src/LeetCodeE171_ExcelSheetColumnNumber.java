/***
 * https://leetcode.com/problems/excel-sheet-column-number/
 */
public class LeetCodeE171_ExcelSheetColumnNumber {

    public static final int LETTER_COUNT = 26;

    public int titleToNumber(String columnTitle) {
        char[] chars = columnTitle.toCharArray();
        int res = 0;

        int n = chars.length;
        for (int i = n - 1; i >= 0; i--) {
            int pow = n - i - 1;
            int letterCountPow = (int)Math.pow(LETTER_COUNT, pow);
            res += charToInt(chars[i]) * letterCountPow;
        }

        return res;
    }

    private int charToInt(char c) {
        return c - 64;
    }

}




