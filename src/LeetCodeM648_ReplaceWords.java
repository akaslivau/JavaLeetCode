import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/replace-words/
 */
public class LeetCodeM648_ReplaceWords {


    public String replaceWords(List<String> dictionary, String sentence) {
        if (dictionary.isEmpty())
            return sentence;

        Map<Integer, Integer> dictMap = dictionary.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toMap(String::hashCode, String::length, (a,b)->a, TreeMap::new));

        int minLength = dictMap.values().stream().min(Integer::compareTo).orElse(-1);

        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() < minLength) {
                sb.append(word);
                sb.append(" ");
                continue;
            }

            sb.append(transform(word, dictMap));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private String transform(String word, Map<Integer, Integer> dictionary) {
        for (Map.Entry<Integer, Integer> entry : dictionary.entrySet()) {
            Integer dictItemLength = entry.getValue();
            if (dictItemLength > word.length())
                return word;

            String wordStart = word.substring(0, dictItemLength);
            if (wordStart.hashCode() == entry.getKey())
                return wordStart;
        }
        return word;
    }

}




