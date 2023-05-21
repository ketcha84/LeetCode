package medium.problem_3;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int n = s.length();
        int firstIndex = 0;
        int[] indexes = new int[96];
        for (int i = 0; i < n; i++) {
            int hash = s.charAt(i) - 32;
            firstIndex = Math.max(indexes[hash], firstIndex);
            result = Math.max(result, i - firstIndex + 1);
            indexes[hash] = i + 1;
        }
        return result;
    }
}
