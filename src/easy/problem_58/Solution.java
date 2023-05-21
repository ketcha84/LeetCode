package easy.problem_58;

public class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0) return 0;

        String s2 = s.trim();
        if (s2.length() == 0) return 0;

        int i = s2.length();
        int count = 0;
        while (i != 0 && s2.charAt(i-1) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}
