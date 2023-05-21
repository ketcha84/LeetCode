package easy.problem_28;

public class Run {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(sol.strStr(haystack, needle));
    }
}
