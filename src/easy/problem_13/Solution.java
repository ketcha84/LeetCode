package easy.problem_13;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        Map<String, Integer> doubleMap = new HashMap<>();
        Map<Character, Integer> singleMap = new HashMap<>();
        doubleMap.put("IV", 4);
        doubleMap.put("IX", 9);

        doubleMap.put("XL", 40);
        doubleMap.put("XC", 90);

        doubleMap.put("CD", 400);
        doubleMap.put("CM", 900);

        singleMap.put('I', 1);
        singleMap.put('V', 5);
        singleMap.put('X', 10);
        singleMap.put('L', 50);
        singleMap.put('C', 100);
        singleMap.put('D', 500);
        singleMap.put('M', 1000);

        //count doubleNums---------------->
        for (String sub : doubleMap.keySet()) {
            if (s.contains(sub)) {
                sum += doubleMap.get(sub);
                s = s.replace(sub, "");
            }
        }

        for (char c : s.toCharArray()) {
            sum += singleMap.get(c);
        }


        return sum;
    }
}