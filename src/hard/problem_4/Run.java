package hard.problem_4;

public class Run {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2, 4};

        Solution sol = new Solution();
        System.out.println(sol.findMedianSortedArrays(nums1, nums2));

    }
}
