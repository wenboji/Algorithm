package com.leetcode;

import java.util.*;

/**
 * @version 1.0 2019-02-19
 * @Author: Wenbo Ji
 * @Description:
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()()"));
    }

    // Hash table that takes care of the mappings.
    private HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public Solution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {

        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                if (stack.isEmpty()) return false;
                char topChar = mappings.get(c);
                if (topChar != stack.pop()) return false;
            } else {
                stack.push(c);
            }

        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }

}
