package medium.problem_74;

public class GenerateTest {
    public static int[][] getMatrix(int rows, int cols) {
        rows = Math.max(rows, 1);
        cols = Math.max(cols, 1);

        int count = 0;
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = count;
                count += 10;
            }
        }
        return mat;
    }
}
