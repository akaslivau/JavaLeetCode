import java.util.*;

/***
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */
public class LeetCodeM17 {
    public List<String> letterCombinations(String digits) {
        Map<String, List<String>> digitMap = new HashMap<>();
        digitMap.put("2", List.of("a", "b", "c"));
        digitMap.put("3", List.of("d", "e", "f"));
        digitMap.put("4", List.of("g", "h", "i"));
        digitMap.put("5", List.of("j", "k", "l"));
        digitMap.put("6", List.of("m", "n", "o"));
        digitMap.put("7", List.of("p", "q", "r", "s"));
        digitMap.put("8", List.of("t", "u", "v"));
        digitMap.put("9", List.of("w", "x", "y", "z"));

        if (digits.length() == 0) {
            return Collections.emptyList();
        }

        if (digits.length() == 1) {
            return digitMap.get(digits);
        }

        List<String> res = digitMap.get(String.valueOf(digits.charAt(0)));
        for (int i = 1; i < digits.length(); i++) {
            List<String> b = digitMap.get(String.valueOf(digits.charAt(i)));
            res = multiply(res, b);
        }

        return res;
    }

    private List<String> multiply(List<String> left, List<String> right) {
        List<String> res = new ArrayList<>();
        for (String s1 : left) {
            for (String s2 : right) {
                res.add(s1 + s2);
            }
        }
        return res;
    }
}




