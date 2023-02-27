/***
 * https://leetcode.com/problems/number-of-arithmetic-triplets/
 */
public class LeetCodeE2367_NumberofArithmeticTriplets {

    public int arithmeticTriplets(int[] nums, int diff) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int d1 = nums[j] - nums[i];

                if (d1 < diff)
                    continue;
                else if (d1 > diff)
                    break;

                for (int k = j + 1; k < nums.length; k++) {
                    int d2 = nums[k] - nums[j];
                    if (d2 < diff)
                        continue;
                    else if (d2 > diff)
                        break;

                    res++;
                    break;
                }
                break;
            }
        }

        return res;
    }

}




