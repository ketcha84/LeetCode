package easy.problem_28;

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() == needle.length()) {
            if (haystack.equals(needle)) {
                return 0;
            } else {
                return -1;
            }
        }

        int needleHash = hash(needle);
        int left = 0;
        int hs = 0;

        while (left <= haystack.length() - needle.length()) {
            if (left == 0) {
                hs = hash(haystack.substring(left, needle.length()));
            } else {
                hs = hs - haystack.charAt(left - 1);
                hs = hs + haystack.charAt(left + needle.length() - 1);
            }
            if (hs == needleHash) {
                if (checkString(haystack, needle, left)) {
                    return left;
                }
            }
            left++;
        }

        return -1;
    }

    private boolean checkString(String haystack, String needle, int index) {
        return haystack.substring(index, index + needle.length()).equals(needle);
    }

    private int hash(String str) {
        int hash = 0;
        for (char c : str.toCharArray()) {
            hash = hash + c;
        }
        return hash;
    }
}
