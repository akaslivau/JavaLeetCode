public class Main {
    public static void main(String[] args) {
        LeetCodeM1743_AdjacentPairs c = new LeetCodeM1743_AdjacentPairs();
        int[] res = c.restoreArray(new int[][]{

                new int[]{-3,-9},
                new int[]{-5,3},
                new int[]{2,-9},
                new int[]{6,-3},
                new int[]{6,1},
                new int[]{5,3},
                new int[]{8,5},
                new int[]{-5,1},
                new int[]{7,2}
        });
        PrintUtils.printArray(res);
    }
}

//7   2   -9  -3  6   1   -5  3   5   8

