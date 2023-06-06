package easy.problem_268;

import java.util.Arrays;

/**
 * The complexity of the algorithm is O(log(n))
 */

public class Solution2 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l = -1, r = nums.length;
        while ((r - l) > 1) {
            int m = (l + r) / 2;
            if (nums[m] != m) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }
}
