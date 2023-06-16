package medium.problem_34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int[] ans = new int[2];
        ans[0] = findTarg(nums, target, false);
        ans[1] = findTarg(nums, target, true);
        return ans;
    }

    private int findTarg(int[] nums, int target, boolean forward) {
        int idx = -1;
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (forward) {
                if (nums[mid] <= target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if (nums[mid] >= target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            if (nums[mid] == target) {
                idx = mid;
            }
        }

        return idx;
    }

}
