/***
 * https://leetcode.com/problems/container-with-most-water/
 */
public class LeetCodeM11_MaxArea {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int res = 0;

        while (left < right) {
            int hl = height[left];
            int hr = height[right];
            int minHeight = Math.min(hl, hr);

            int newArea = (right - left) * minHeight;

            res = Math.max(res, newArea);

            if (hl < hr) {
                left++;
            } else if (hr < hl) {
                right--;
            } else {
                left++;
                right--;
            }

        }
        return res;
    }

}




