package medium.problem_7;

public class Solution {
    public int reverse(int x) {
        if (x < 0) {
            return -readNum(Math.abs(x));
        } else {
            return readNum(x);
        }
    }

    private int readNum(int x) {
        int temp = x;
        int digit;
        StringBuilder sb = new StringBuilder();

        while (temp != 0) {
            digit = temp % 10;
            temp = temp / 10;
            sb.append(digit);
        }

        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
