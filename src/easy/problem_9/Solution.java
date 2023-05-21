package easy.problem_9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;
        int reverseNum = 0;
        while (x > reverseNum) {
            reverseNum = reverseNum * 10 + (x % 10);
            x /= 10;
        }
        return (reverseNum == x || x == reverseNum / 10);
    }
}
