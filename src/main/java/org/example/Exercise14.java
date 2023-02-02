package org.example;

import org.example.domen.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Exercise14 {
    /*
Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Time complexity = O(n)

Space complexity O(n)
    */

    private static Map<Character, Character> opens = new HashMap<>();
    private static Map<Character, Character> closed = new HashMap<>();
    static {
        opens.put('(', ')');
        opens.put('{', '}');
        opens.put('[', ']');

        opens.forEach((k, v) -> closed.put(v, k));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (opens.containsKey(c)) {
                stack.push(c);
            } else if (closed.containsKey(c)) {
                Character head = closed.get(c);
                if (stack.empty() || !head.equals(stack.pop())) {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
