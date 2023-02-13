import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LeetCodeM648_ReplaceWords c = new LeetCodeM648_ReplaceWords();
        String res = c.replaceWords(Arrays.asList("a", "aa", "aaa", "aaaa"), "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa");
        System.out.println(res);
    }
}


