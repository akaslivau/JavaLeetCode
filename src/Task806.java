///https://leetcode.com/problems/number-of-lines-to-write-string/

public class Task806 {
    public int[] numberOfLines(int[] widths, String s) {
        final int bias = 97;
        final int lineWidth = 100;

        int lineSum = 0;
        int lineCount = 1;
        for (char c : s.toCharArray()) {
            lineSum += widths[c - bias];
            if (lineSum > lineWidth) {
                lineCount++;
                lineSum = widths[c - bias];
            }
        }
        return new int[]{lineCount, lineSum};
    }
}

