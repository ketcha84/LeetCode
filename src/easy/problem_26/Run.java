package easy.problem_26;

public class Run {
    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution sol = new Solution();
        System.out.println(sol.removeDuplicates(array));
    }
}
