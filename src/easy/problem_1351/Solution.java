package easy.problem_1351;

public class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;

        for (int[] ints : grid) {
            int l = -1;
            int r = ints.length;
            int m;
            while (r > l + 1) {
                m = (l + r) / 2;
                if (ints[m] < 0) {
                    r = m;
                } else {
                    l = m;
                }
            }

            ans = ans + (ints.length - 1 - l);

        }
        return ans;
    }
}
