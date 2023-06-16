package medium.problem_74;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0) return false;

        int l = -1;
        int r = matrix.length;
        int m;
        while (r > l + 1) {
            m = (l + r) / 2;
            if (matrix[m][0] == target) {
                return true;
            }
            if (matrix[m][0] < target) {
                l = m;
            } else {
                r = m;
            }
        }

        int row = Math.max(l, 0);
        l = -1;
        r = matrix[row].length;
        while (r > l + 1) {
            m = (l + r) / 2;
            if (matrix[row][m] == target) {
                return true;
            }

            if (matrix[row][m] < target) {
                l = m;

            } else {
                r = m;
            }
        }
        return false;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0) {
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target)
                j --;
            else if(matrix[i][j] < target)
                i ++;
        }
        return false;
    }
}
