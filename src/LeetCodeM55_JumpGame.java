import java.util.Arrays;

/***
 * https://leetcode.com/problems/jump-game/
 */
public class LeetCodeM55_JumpGame {

    public boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;

        int jumpPower = nums[0];
        if (jumpPower >= nums.length - 1)
            return true;

        int max = 0;
        int maxIndex = -1;
        for (int i = 1; i <= jumpPower; i++) {
            int curPower = nums[i];
            if (curPower >= nums.length - i - 1)
                return true;

            if (curPower > 0 && curPower >= max && anyNotNullAhead(nums, i)) {
                maxIndex = i;
                max = curPower;
            }
        }
        if (maxIndex < 0)
            return false;

        int[] ahead = Arrays.copyOfRange(nums, maxIndex, nums.length);
        return canJump(ahead);
    }

    private boolean anyNotNullAhead(int[] nums, int index) {
        int power = nums[index];
        while (power > 0) {
            int cur = index + power;
            if (cur > nums.length - 1) {
                power--;
                continue;
            }
            if (nums[cur] > 0)
                return true;

            power--;
        }
        return false;
    }


}




