package easy.problem_66;

public class Solution {
    public int[] plusOne(int[] digits) {
        int r = digits.length - 2;
        digits[digits.length - 1]++;

        while (r >= 0 && digits[r + 1] > 9) {
            digits[r] = digits[r] + digits[r + 1] / 10;
            digits[r + 1] = digits[r + 1] % 10;
            r--;
        }
        if (digits[0] == 10) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            digits[0] = 0;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        }

        return digits;
    }
}
