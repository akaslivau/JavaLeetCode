import java.util.Arrays;

/***
 * https://leetcode.com/problems/last-stone-weight/
 */
public class LeetCodeE1046_LastStoneWeight {

  public static void main(String[] args) {
    int[] ints = {1};
    System.out.println(lastStoneWeight(ints));
  }

  public static int lastStoneWeight(int[] stones) {
    if(stones.length == 1){
      return stones[0];
    }
    Arrays.sort(stones);
    int n = stones.length;

    int lastIndex = n - 1;

    while (stones[1] > 0) {
      int afterSmashWeight = smashAndGetWeight(lastIndex, stones);
      lastIndex = getNewLastIndex(lastIndex, afterSmashWeight);

      if (afterSmashWeight > 0) {
        update(stones, afterSmashWeight);
      }
    }
    return stones[0];
  }

  private static void update(int[] a, int key) {
    int index = -1;

    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] == 0) {
        index = i;
        break;
      }

      if (key >= a[i]) {
        continue;
      }

      index = i;
      break;
    }

    for (int i = a.length - 1; i > index; i--) {
      a[i] = a[i - 1];
    }
    a[index] = key;
  }


  private static int smashAndGetWeight(int index, int[] source) {
    int last = source[index];
    int prev = source[index - 1];

    source[index] = 0;
    source[index - 1] = 0;

    return last - prev;
  }

  private static int getNewLastIndex(int curLastIndex, int afterSmashWeight) {
    return afterSmashWeight == 0 ? curLastIndex - 2 : curLastIndex - 1;
  }
}




