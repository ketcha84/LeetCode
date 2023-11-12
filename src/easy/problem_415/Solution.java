package easy.problem_415;

public class Solution {
    public String addStrings(String num1, String num2) {
        int[] c;
        if (num1.length() >= num2.length()) {
            c = new int[num1.length() + 1];
            sum(num1, num2, c);
        } else {
            c = new int[num2.length() + 1];
            sum(num2, num1, c);
        }
        return backConvert(c);
    }

    public String backConvert(int[] arr) {
        StringBuilder sb = new StringBuilder();
        if (arr[0] != 0) {
            for (int x : arr) {
                sb.append(x);
            }
        } else {
            for (int i = 1; i < arr.length; i++) {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }

    public int conver(char c) {
        return (int) (c - '0');
    }

    public void sum(String n1, String n2, int[] c) {
        int r1 = n1.length() - 1;
        int r2 = n2.length() - 1;
        while (r1 >= 0) {
            int sum = 0;
            int n = 0;
            if (r1 == 0) {

                n = conver(n1.charAt(r1)) + c[r1];
                c[r1] += n % 10;
                c[r1] = n / 10;
            }
            if (r2 >= 0) {
                n = conver(n1.charAt(r1)) + conver(n2.charAt(r2)) + c[r1];
                sum = c[r1 + 1] + n;
                c[r1 + 1] = (sum % 10);
                c[r1] = sum / 10;
            } else {
                n = conver(n1.charAt(r1)) + c[r1];
                sum = c[r1 + 1] + n;
                c[r1 + 1] = (sum % 10);
                c[r1] = sum / 10;
            }
            r1--;
            r2--;
        }
    }
}
