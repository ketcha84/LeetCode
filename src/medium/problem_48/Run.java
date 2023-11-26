package medium.problem_48;


import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        sol.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

}
