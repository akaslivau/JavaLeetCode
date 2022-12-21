import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/***
 * https://leetcode.com/problems/partition-labels/
 */
public class LeetCodeM763_PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new LinkedList<>();

        char[] chars = s.toCharArray();
        Set<String> set = new HashSet<>();
        int lastLen = 0;
        for (int i = 0; i < chars.length; i++) {
            String letter = String.valueOf(chars[i]);
            set.add(letter);
            int lastIndex = s.lastIndexOf(letter);

            if (lastIndex == i) {
                set.remove(letter);
                if (set.isEmpty()) {
                    res.add(i + 1 - lastLen);
                    lastLen = i + 1;
                }

            }
        }
        return res;
    }


}




