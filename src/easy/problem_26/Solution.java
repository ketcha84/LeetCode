package easy.problem_26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int val = -1000;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                val = nums[i];
                nums[k] = val;
                k++;
            }
        }
        return k;
    }
}
