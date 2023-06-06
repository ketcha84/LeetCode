package easy.problem_349;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(sol.intersection(nums1, nums2)));
    }
}
