import java.util.*;

/***
 * https://leetcode.com/problems/restore-the-array-from-adjacent-pairs/
 */
public class LeetCodeM1743_AdjacentPairs {


    public int[] restoreArray(int[][] pairs) {
        int n = pairs.length + 1;

        Map<Integer, List<Integer>> graph = buildGraph(pairs);

        int[] res = new int[n];
        res[0] = graph.entrySet().stream().filter(x -> x.getValue().size() == 1).map(Map.Entry::getKey).findFirst().orElse(Integer.MAX_VALUE);

        int i = 1;
        Set<Integer> added = new HashSet<>();
        added.add(res[0]);
        while (i < n) {
            List<Integer> nodes = graph.get(res[i - 1]);
            if (nodes.size() == 1) {
                added.add(nodes.get(0));
                res[i] = nodes.get(0);
            } else {
                int toAdd = added.contains(nodes.get(0))?
                        nodes.get(1):
                        nodes.get(0);
                added.add(toAdd);
                res[i] = toAdd;
            }
            i++;
        }
        return res;
    }

    private Map<Integer, List<Integer>> buildGraph(int[][] pairs) {
        Map<Integer, List<Integer>> res = new HashMap<>();
        for (int[] pair : pairs) {
            process(res, pair[0], pair[1]);
            process(res, pair[1], pair[0]);
        }
        return res;
    }

    private static void process(Map<Integer, List<Integer>> res, int key, int value) {
        if (res.containsKey(key)) {
            List<Integer> list = res.get(key);
            list.add(value);
            res.put(key, list);
        } else {
            res.put(key, new ArrayList<>(List.of(value)));
        }
    }


}




