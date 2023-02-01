import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/custom-sort-string/
 */
public class LeetCodeM791_CustomSortString {


    public String customSortString(String order, String s) {
        Map<String, Integer> orderMap = buildOrderMap(order.toCharArray());

        return s.codePoints().mapToObj(c -> String.valueOf((char) c))
                .sorted((a, b) -> Integer.compare(getOrder(a, orderMap), getOrder(b, orderMap)))
                .collect(Collectors.joining());
    }

    private int getOrder(String key, Map<String, Integer> orderMap) {
        return orderMap.getOrDefault(key, Integer.MAX_VALUE);
    }

    private static Map<String, Integer> buildOrderMap(char[] chars) {
        Map<String, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            orderMap.put(String.valueOf(chars[i]), i);
        }
        return orderMap;
    }

}




