package easy.problem_350;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {9,4,9,8,4};
        int[] nums2 = {4,9,5};
        System.out.println(Arrays.toString(sol.intersect(nums1, nums2)));
    }

}
