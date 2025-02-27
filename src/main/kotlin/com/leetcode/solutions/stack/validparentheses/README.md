# Valid Parentheses Solution in Kotlin

## Problem Statement
Given a string `s` containing only `()[]{}`, determine if it is valid. The string is valid if:
- Open brackets must be closed by the same type.
- Open brackets must be closed in the correct order.
- Every closing bracket has a corresponding opening bracket.

## Solution Approach
- **Data Structure Used:** Stack (LIFO - Last In, First Out).
- **Algorithm:**
    - Iterate through `s`, pushing opening brackets onto a stack.
    - If a closing bracket is found, check if it matches the last opened bracket.
    - If mismatched or the stack is empty at the end, return `false`.
    - Otherwise, return `true`.

## Complexity Analysis
- **Time Complexity:** `O(n)` - Single pass through the string.
- **Space Complexity:** `O(n)` - Stack stores at most `n/2` elements.