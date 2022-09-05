import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = new int[]{2, 0, 2, 1, 1, 0};
        LeetCode75 test = new LeetCode75();
        test.sortColors(data);
        System.out.println(Arrays.toString(data));
    }
}


