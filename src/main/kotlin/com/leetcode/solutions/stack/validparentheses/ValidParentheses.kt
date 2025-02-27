package com.leetcode.solutions.stack.validparentheses

fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    val bracketMap = mapOf(')' to '(', '}' to '{', ']' to '[')

    for (char in s) {
        if (char in bracketMap.values) {
            // If it's an opening bracket, push to stack
            stack.addLast(char)
        } else if (char in bracketMap.keys) {
            // If it's a closing bracket, check stack
            if (stack.isEmpty() || stack.removeLast() != bracketMap[char]) {
                return false
            }
        }
    }

    return stack.isEmpty() // If stack is empty, all brackets matched correctly
}

fun main() {
    val testCases = listOf(
        "()", "()[]{}", "(]", "([])", "{[()]}", "{[(])}", ""
    )

    for (test in testCases) {
        println("Input: \"$test\" -> Output: ${isValid(test)}")
    }
}