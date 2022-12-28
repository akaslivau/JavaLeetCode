/***
 * https://leetcode.com/problems/remove-element/
 */
public class LeetCodeE27_RemoveElement {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result++] = nums[i];
            }
        }
        return result;
    }

}




