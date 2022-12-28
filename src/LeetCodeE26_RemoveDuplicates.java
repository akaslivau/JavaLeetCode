/***
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class LeetCodeE26_RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1)
            return 1;

        int result = 1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev) {
                continue;
            }
            nums[result++] = nums[i];
            prev = nums[i];
        }

        return result;
    }

}




