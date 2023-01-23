public class Main {
    public static void main(String[] args) {
        LeetCodeM48_RotateImage c = new LeetCodeM48_RotateImage();
        int[][] m = {
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9}
        };
        c.rotate(m);
        PrintUtils.printMatrix(m);
    }
}


