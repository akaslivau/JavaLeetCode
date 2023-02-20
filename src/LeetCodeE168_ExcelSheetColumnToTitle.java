/***
 * https://leetcode.com/problems/excel-sheet-column-title/
 */
public class LeetCodeE168_ExcelSheetColumnToTitle {

    public String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
    }


}




