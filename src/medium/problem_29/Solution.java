package medium.problem_29;

public class Solution {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;

        int sing = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        long divident = dividend < 0 ? (long) ~dividend + 1 : dividend;
        long div = divisor < 0 ? (long) ~divisor + 1 : divisor;

        long result = 0, temp = 0;
        int mask;
        for (int i = 31; i >= 0; i--) {
            mask = 1 << i;
            if (temp + (div << i) <= divident) {
                temp += (div << i);
                result |= mask;
            }
        }

        result = sing < 0 ? -result : result;
        return (int) result;
    }
}
