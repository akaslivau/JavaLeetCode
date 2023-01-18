/***
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class LeetCodeH42_Trap {

    public int trap(int[] height) {
        int res = 0;
        int n = height.length;

        if (n < 3)
            return res;


        int[] fromLeft = new int[n];
        int[] fromRight = new int[n];

        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, height[i]);
            fromLeft[i] = max;
        }

        max = -1;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            fromRight[i] = max;
        }

        for (int i = 0; i < n; i++) {
            res += Math.min(fromLeft[i], fromRight[i]) - height[i];
        }
        return res;
    }


}




