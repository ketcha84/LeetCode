package easy.problem_35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = -1;
        int r = nums.length;
        int m;
        while (r > l + 1) {
            m = (l + r) / 2;
            if (nums[m] < target) {
                l = m;
            } else {
                r = m;
            }
        }
        return r;
    }
}
