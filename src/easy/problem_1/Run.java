package easy.problem_1;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = new int[]{3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(sol.twoSum(arr, target)));
    }
}
