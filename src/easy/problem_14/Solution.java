package easy.problem_14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minSize = Integer.MAX_VALUE;

        for (int i = 0; i < strs.length; i++) {
            if (minSize > strs[i].length()) {
                minSize = strs[i].length();
            }
        }

        int indChar = 0;
        StringBuilder sb = new StringBuilder();
        while (indChar < minSize) {
            boolean eq = true;
            char c = strs[0].charAt(indChar);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(indChar) != c) {
                    eq = false;
                }
            }
            if(eq){
                sb.append(c);
            }else {
                return sb.toString();
            }
            indChar++;
        }
        return sb.toString();
    }
}
