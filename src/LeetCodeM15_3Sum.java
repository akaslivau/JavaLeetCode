import java.util.*;

/***
 * https://leetcode.com/problems/3sum/
 */
public class LeetCodeM15_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        Set<String> hashes = new HashSet<>();

        for (int i = 0; i < n - 2; i++) {
            int a = nums[i];

            for (int j = i + 1; j < n - 1; j++) {
                int b = nums[j];

                int abSum = a + b;
                if (abSum > 0)
                    break;

                int foundedIndex = Arrays.binarySearch(nums, Math.abs(abSum));
                if (foundedIndex < 0)
                    continue;

                int from = Math.max(foundedIndex, j + 1);

                for (int k = from; k < n; k++) {
                    int c = nums[k];
                    if (-abSum == c) {
                        List<Integer> item = new ArrayList<>(List.of(a, b, c));
                        item.sort(Integer::compareTo);
                        String hash = a + "_" + b + "_" + c;
                        if (hashes.contains(hash)) {
                            break;
                        }
                        hashes.add(hash);
                        res.add(item);
                        break;
                    }
                }
            }
        }
        return res;
    }

}




