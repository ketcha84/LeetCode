package medium.problem_34;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.searchRange(nums, 10)));
    }
}
