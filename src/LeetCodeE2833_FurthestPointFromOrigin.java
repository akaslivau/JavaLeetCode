/***
 * https://leetcode.com/problems/furthest-point-from-origin/description/
 */
public class LeetCodeE2833_FurthestPointFromOrigin {

    public static void main(String[] args) {
        System.out.println(furthestDistanceFromOrigin("_R__LL_"));
    }

    public static int furthestDistanceFromOrigin(String moves) {
        int lCount = 0;
        int rCount = 0;
        int spaceCount = 0;
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'R') {
                rCount++;
            } else if (c == 'L') {
                lCount--;
            } else {
                spaceCount++;
            }
        }

        return rCount >= -lCount ? rCount + lCount + spaceCount : Math.abs(rCount + lCount - spaceCount);
    }
}




