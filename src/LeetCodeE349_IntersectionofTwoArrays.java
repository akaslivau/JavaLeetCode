import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class LeetCodeE349_IntersectionofTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums2).boxed().distinct().collect(Collectors.toSet());
        return Arrays.stream(nums1).boxed().filter(set::contains).distinct().mapToInt(x -> x).toArray();
    }

}




