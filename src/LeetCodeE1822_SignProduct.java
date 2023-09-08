/***
 * https://leetcode.com/problems/sign-of-the-product-of-an-array/
 */
public class LeetCodeE1822_SignProduct {

  public int arraySign(int[] nums) {
    boolean negativeEven = true;

    for (int num : nums) {
      if (num == 0) {
        return 0;
      }
      if (num < 0) {
        negativeEven = !negativeEven;
      }
    }
    return negativeEven ? 1 : -1;
  }
}




