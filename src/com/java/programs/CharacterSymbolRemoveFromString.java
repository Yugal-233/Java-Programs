package com.java.programs;

public class CharacterSymbolRemoveFromString {
    public static void main(String[] args) {
        String s = "1A56#2B#EFH*2LAGD5T";

        // Use regular expression to remove numbers and symbols
        String result = s.replaceAll("[^A-Za-z]", "");

        System.out.println("Original string: " + s);
        System.out.println("String with numbers and symbols removed: " + result);
    }
}
