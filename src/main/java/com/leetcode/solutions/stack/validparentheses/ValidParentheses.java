package com.leetcode.solutions.stack.validparentheses;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Mapping of closing to opening brackets
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push opening brackets onto stack
            } else {
                if (stack.isEmpty()) return false; // No matching opening bracket

                char top = stack.pop(); // Get last opened bracket

                // Check if it matches the correct opening bracket
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // Stack should be empty if valid
    }

    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([])")); // true
        System.out.println(isValid("([)]")); // false
    }
}
