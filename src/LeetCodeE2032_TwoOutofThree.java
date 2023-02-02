import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/two-out-of-three/
 */
public class LeetCodeE2032_TwoOutofThree {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res = intersection(nums1, nums2);
        res.addAll(intersection(nums2, nums3));
        res.addAll(intersection(nums1, nums3));
        return res.stream().distinct().collect(Collectors.toList());
    }

    private static List<Integer> intersection(int[] a, int[] b) {
        return Arrays.stream(a).distinct()
                .filter(x -> Arrays.stream(b).anyMatch(y -> y == x))
                .boxed()
                .collect(Collectors.toList());
    }

}




