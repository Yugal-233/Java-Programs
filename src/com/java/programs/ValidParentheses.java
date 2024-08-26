package com.java.programs;

import java.util.*;

    public class ValidParentheses {

        public static void main(String[] args) {
            String s = "{[][]()}[][(])";
            int index = findInvalidParentheses(s);

            if (index == -1) {
                System.out.println("The parentheses are valid.");
            } else {
                System.out.println("The parentheses are not valid. Error at index " + index + ".");
            }
        }

        public static int findInvalidParentheses(String s) {
            int balance = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    balance++;
                } else if (c == ')' || c == '}' || c == ']') {
                    balance--;
                    if (balance < 0) {
                        return i;
                    }
                }
            }

            return balance == 0 ? -1 : s.length() - 1;
        }
    }
