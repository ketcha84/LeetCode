package easy.problem_260;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 2, 5};
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.singleNumber(array)));
    }
}
