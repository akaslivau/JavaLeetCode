import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/***
 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
 */
public class LeetCodeE1394_FindLucky {

  public int findLucky(int[] arr) {
    TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());

    for (int num : arr) {
      map.merge(num, 1, (old, neu)->old+1);
    }

    for (Map.Entry<Integer, Integer> e : map.entrySet()) {
      if(e.getKey().equals(e.getValue())){
        return e.getKey();
      }
    }

    return -1;
  }
}




