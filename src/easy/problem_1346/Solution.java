package easy.problem_1346;

import java.util.Arrays;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int l = -1;
            int r = arr.length;

            while (r > l + 1) {
                int m = (l + r) / 2;
                if (arr[m] == arr[i] * 2 && m != i) {
                    return true;
                }
                if (arr[m] <= arr[i] * 2) {
                    l = m;
                } else {
                    r = m;
                }
            }
        }
        return false;
    }
}
