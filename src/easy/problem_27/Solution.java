package easy.problem_27;

import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 1000;
                k--;
            }
        }
        Arrays.sort(nums);
        return k;
    }
}
