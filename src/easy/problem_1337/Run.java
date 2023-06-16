package easy.problem_1337;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.kWeakestRows(arr, 3)));
    }
}
