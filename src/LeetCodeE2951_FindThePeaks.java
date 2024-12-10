import java.util.LinkedList;
import java.util.List;

/***
 * https://leetcode.com/problems/find-the-peaks/description/
 */
public class LeetCodeE2951_FindThePeaks {

    public static void main(String[] args) {

        System.out.println(findPeaks(new int[]{1, 4, 3, 8, 5}));
    }

    public static List<Integer> findPeaks(int[] mountain) {
        int length = mountain.length;
        List<Integer> peaks = new LinkedList<>();
        for (int i = 1; i < length - 1; i++) {
            if ((mountain[i] > mountain[i - 1]) && (mountain[i] > mountain[i + 1])) {
                peaks.add(i);
            }
        }
        return peaks;
    }

}




