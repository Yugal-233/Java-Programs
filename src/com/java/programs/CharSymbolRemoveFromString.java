package com.java.programs;

public class CharSymbolRemoveFromString {
    public static void main(String[] args) {
        String s = "1A56#2B#EFH*2LAGD5T";
        String stringWithoutNumbersAndSymbols = s.replaceAll("[^A-Za-z]", "");
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum =sum+ Character.getNumericValue(c);
            }
        }
        System.out.println("Original string: " + s);
        System.out.println("String with numbers and symbols removed: " + stringWithoutNumbersAndSymbols);
        System.out.println("Sum of numbers: " + sum);
    }
}
