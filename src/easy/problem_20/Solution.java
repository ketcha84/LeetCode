package easy.problem_20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(' -> {
                    stack.push(c);
                }
                case ')' -> {
                    if (stack.size() == 0 || '(' != stack.pop()) {
                        return false;
                    }
                }
                case '[' -> {
                    stack.push(c);
                    break;
                }
                case ']' -> {
                    if (stack.size() == 0 || '[' != stack.pop()) {
                        return false;
                    }
                }
                case '{' -> {
                    stack.push(c);
                }
                case '}' -> {
                    if (stack.size() == 0 || '{' != stack.pop()) {
                        return false;
                    }
                }
            }
        }
        return stack.size() == 0;
    }
}
