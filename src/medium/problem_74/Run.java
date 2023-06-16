package medium.problem_74;

public class Run {
    public static void main(String[] args) {
        int[][] mat = {{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}};
        Solution sol = new Solution();
        System.out.println(sol.searchMatrix2(mat, 17));
    }
}
