package easy.problem_349;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(sol.intersection(nums1, nums2)));
    }
}
