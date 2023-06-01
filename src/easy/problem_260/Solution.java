package easy.problem_260;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> ints = new HashMap<>();

        for (int i : nums) {
            if (!ints.containsKey(i)) {
                ints.put(i, 1);
            } else {
                int amount = ints.get(i);
                amount++;
                ints.put(i, amount);
            }
        }
        int[] result = new int[2];
        int i = 0;
        for (int x : ints.keySet()) {
            if (ints.get(x) == 1) {
                result[i++] = x;
            }
            if (i > 1) return result;
        }

        return null;
    }
}
