package easy.problem_744;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = -1;
        int r = letters.length;
        int m;

        while (r - l > 1) {
            m = (l + r) / 2;
            if (letters[m] == target) {
                if (m < letters.length - 1) return getNext(letters, m, target);
                else return letters[0];
            }
            if (letters[m] > target) {
                r = m;
            } else {
                l = m;
            }
        }
        if (l < letters.length - 1) {
            return letters[l + 1];
        } else {
            return letters[0];
        }
    }

    private char getNext(char[] letters, int index, char target) {
        while (index <= letters.length - 1) {
            if (letters[index] > target) {
                return letters[index];
            }
            index++;
        }
        return letters[0];
    }

}
