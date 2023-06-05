package easy.problem_704;

public class Solution {
    public int search(int[] nums, int target) {
        int l = -1, r = nums.length;

        while ((r - l) > 1) {
            int m = (l + r) / 2;
            if (nums[m] == target) return m;
            if (nums[m] > target) {
                r = m;
            } else {
                l = m;
            }
        }

        return -1;
    }
}
