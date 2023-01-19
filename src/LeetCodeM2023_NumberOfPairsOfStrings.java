/***
 * https://leetcode.com/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target/
 */
public class LeetCodeM2023_NumberOfPairsOfStrings {

    public int numOfPairs(String[] nums, String target) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) continue;

                if ((nums[i] + nums[j]).equals(target)) {
                    count++;
                }
                if ((nums[j] + nums[i]).equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }

}




