package easy.problem_1351;

public class Run {
    public static void main(String[] args) {
        int[][] mat = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        Solution sol = new Solution();
        System.out.println(sol.countNegatives(mat));

    }
}
