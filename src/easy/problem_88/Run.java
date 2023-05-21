package easy.problem_88;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        int[] nums1 = new int[]{0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 0, n = 3;

        Solution sol = new Solution();
        sol.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
