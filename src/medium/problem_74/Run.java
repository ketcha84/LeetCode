package medium.problem_74;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
//        int[][] mat = {{1, 3, 5, 7},
//                {10, 11, 16, 20},
//                {23, 30, 34, 60}};

        int[][] mat = GenerateTest.getMatrix(10000, 10000);

        Solution sol = new Solution();


        System.out.println(sol.searchMatrix(mat, 9_990_000));

    }
}
