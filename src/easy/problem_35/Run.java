package easy.problem_35;

public class Run {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 7;
        Solution sol = new Solution();

        System.out.println(sol.searchInsert(nums, target));
    }
}
