package com.java.programs;

public class CharacterAndNumberFiltering {
    public static void main(String[] args) {
        String s = "1A2B#E5T";
        int sum = 0;
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum = sum + Character.getNumericValue(c);
            } else if (Character.isLetter(c)) {
                result.append(c);
            }
        }
        System.out.println("Total of numbers: " + sum);
        System.out.println("String result: " + result);
    }
}
