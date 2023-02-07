import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/***
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class LeetCodeE345_ReverseVowels {

    public String reverseVowels(String s) {
        List<String> vowels = s.chars().mapToObj(x->String.valueOf((char)x))
                .filter(this::isVowel)
                .collect(Collectors.toCollection(LinkedList::new));

        if (vowels.isEmpty())
            return s;
        AtomicInteger n = new AtomicInteger(vowels.size() - 1);

        StringBuilder sb = new StringBuilder();
        s.chars().forEach(c -> {
            String str = String.valueOf((char)c);
            sb.append(isVowel(str) ? vowels.get(n.getAndDecrement()) : str);
        });
        return sb.toString();
    }

    private boolean isVowel(String s) {
        return s.equals("a")
                || s.equals("A")
                || s.equals("e")
                || s.equals("E")
                || s.equals("i")
                || s.equals("I")
                || s.equals("o")
                || s.equals("O")
                || s.equals("u")
                || s.equals("U");
    }

}




