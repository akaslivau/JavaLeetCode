import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class LeetCodeE350_IntersectionofTwoArraysTwo {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();

        List<Integer> items2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        for (int a : nums1) {
            if (items2.contains(a)) {
                res.add(a);
                items2.remove((Integer) a);
            }
        }
        return res.stream().mapToInt(a -> a).toArray();
    }

}




