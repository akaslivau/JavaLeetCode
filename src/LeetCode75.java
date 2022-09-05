/***
 * https://leetcode.com/problems/sort-colors/
 */
public class LeetCode75 {
    public void sortColors(int[] nums) {
        int redCnt = 0;
        int whiteCnt = 0;
        int blueCnt = 0;

        for (int value : nums) {
            if (value == 0)
                redCnt++;
            else if (value == 1)
                whiteCnt++;
            else blueCnt++;
        }

        for (int i = 0; i < redCnt; i++) {
            nums[i] = 0;
        }

        for (int i = 0; i < whiteCnt; i++) {
            nums[i + redCnt] = 1;
        }

        for (int i = 0; i < blueCnt; i++) {
            nums[i + redCnt + whiteCnt] = 2;
        }

    }
}




