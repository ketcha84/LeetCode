package easy.problem_137;

import java.util.*;

public class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int uniqSum = 0;
        int sum = 0;

        for (int x : nums) {
            if (!set.contains(x)) {
                set.add(x);
                uniqSum += x;
            }
            sum += x;
        }

        return (uniqSum * 3 - sum) / 2;
    }
}
