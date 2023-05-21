package medium.problem_6;

import java.util.ArrayList;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        ArrayList<Character>[] arrayLists = new ArrayList[numRows];
        init(arrayLists);
        char[] chars = s.toCharArray();
        int indexChars = 0;
        int indexLists = 0;
        boolean isForward = true;

        while (indexChars < chars.length) {

            if (isForward) {
                if (indexLists < arrayLists.length) {
                    arrayLists[indexLists++].add(chars[indexChars]);
                } else {
                    indexLists--;
                    isForward = false;
                    continue;
                }

            } else {

                if (indexLists > 0) {
                    arrayLists[--indexLists].add(chars[indexChars]);
                } else {
                    isForward = true;
                    indexLists++;
                    continue;
                }
            }
            indexChars++;
        }


        return mergeChars(arrayLists);
    }

    private static String mergeChars(ArrayList<Character>[] arrayLists) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayLists.length; i++) {
            for(char c: arrayLists[i]){
                sb.append(c);
            }
        }
        return sb.toString();
    }



    private static void init(ArrayList<Character>[] arrayLists) {
        for (int i = 0; i < arrayLists.length; i++) {
            arrayLists[i] = new ArrayList<>();
        }
    }
}
