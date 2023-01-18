public class Main {
    public static void main(String[] args) {
        LeetCodeE1572_MatrixDiagonalSum c = new LeetCodeE1572_MatrixDiagonalSum();

        int res = c.diagonalSum(new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9},
        });

        System.out.println(res);
    }
}


