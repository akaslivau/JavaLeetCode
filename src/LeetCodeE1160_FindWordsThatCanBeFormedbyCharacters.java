import java.util.Map;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 */
public class LeetCodeE1160_FindWordsThatCanBeFormedbyCharacters {

    public int countCharacters(String[] words, String chars) {
        int res = 0;
        Map<Character, Long> charMap = toCharMap(chars);

        for (String word : words) {
            Map<Character, Long> wordCharMap = toCharMap(word);

            boolean isGood = true;
            for (Map.Entry<Character, Long> e : wordCharMap.entrySet()) {
                long diff = charMap.getOrDefault(e.getKey(), -9999999L) - e.getValue();
                if (diff < 0) {
                    isGood = false;
                    break;
                }
            }
            if (isGood)
                res += word.length();
        }

        return res;
    }

    private static Map<Character, Long> toCharMap(String chars) {
        return chars.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(a -> a, Collectors.counting()));
    }

}




