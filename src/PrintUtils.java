import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintUtils {
    private PrintUtils() {
    }

    public static void print(int[][] m) {
        for (int[] ints : m) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void print(int[] res) {
        System.out.println(Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }

    public static void print(List<Integer> res) {
        for (Integer item : res) {
            System.out.println(item);
        }
    }

    public static void print(Object res) {
        System.out.println(res);
    }
}
