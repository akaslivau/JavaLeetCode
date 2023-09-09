import java.util.LinkedList;

/***
 * https://leetcode.com/problems/maximum-69-number/
 */
public class LeetCodeE1323_Maximum69Number {

  public static void main(String[] args) {
    maximum69Number(69966);
  }

  public static int maximum69Number(int num) {
    int res = 0;

    LinkedList<Integer> stack = new LinkedList<Integer>();
    while (num > 0) {
      stack.push(num % 10);
      num /= 10;
    }
    int n = stack.size();
    boolean changed = false;
    while (!stack.isEmpty()) {
      Integer pop = stack.pop();
      if(pop == 6 && !changed){
        pop = 9;
        changed = true;
      }
      res += pop * Math.pow(10, n-1);
      n--;
    }

    return res;
  }

}




