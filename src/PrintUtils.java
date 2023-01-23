import java.util.Arrays;

public class PrintUtils {
    private PrintUtils() {
    }

    public static void printMatrix(int[][] m) {
        for (int[] ints : m) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
