/***
 * https://leetcode.com/problems/find-the-highest-altitude/
 */
public class LeetCodeE1732_LargestAttitude {

    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int n = gain.length;

        int prev = 0;
        for (int v : gain) {
            int cur = v + prev;
            max = Math.max(cur, max);
            prev = cur;
        }
        return Math.max(max, 0);
    }

}




