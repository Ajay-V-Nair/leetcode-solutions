# Valid Parentheses Solution in Java

## Problem Statement
Given a string `s` containing just the characters `'(', ')', '{', '}', '[' and ']'`, determine if the input string is **valid**.

A string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every closing bracket must have a corresponding open bracket.

## Solution Approach
We use a **stack** data structure to track opening brackets. As we iterate through the string:
- Push opening brackets onto the stack.
- When encountering a closing bracket:
    - If the stack is empty, return `false`.
    - Pop the top of the stack and check if it matches the correct opening bracket.
    - If it doesn’t match, return `false`.
- After processing, the stack should be empty for a valid string.

## Complexity Analysis
- **Time Complexity:** `O(n)` where `n` is the length of the string.
- **Space Complexity:** `O(n)` in the worst case (all opening brackets).