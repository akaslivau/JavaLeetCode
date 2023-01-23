import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class LeetCodeM451_SortCharsByFreq {

    public String frequencySort(String s) {
        if (s.length() == 1)
            return s;

        String TECH_CHAR = "~";

        s = s + TECH_CHAR;

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        char prev = chars[0];
        StringBuilder sb = new StringBuilder();
        sb.append(prev);

        List<String> parts = new ArrayList<>();
        for (int i = 1; i < chars.length; i++) {
            char cur = chars[i];
            if (cur == prev) {
                sb.append(cur);
            } else {
                parts.add(sb.toString());
                sb = new StringBuilder();
                sb.append(cur);
                prev = cur;
            }
        }
        return parts.stream().sorted((a, b) -> b.length() - a.length()).collect(Collectors.joining());
    }
}




