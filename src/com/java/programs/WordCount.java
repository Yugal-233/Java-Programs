package com.java.programs;

import java.util.Arrays;

public class WordCount {
    public static void main(String[] args) {
        String str = "1234 radha is my 7890 sister 0909";
        long wordCount = Arrays.stream(str.split(" "))
                .filter(word -> !word.isEmpty())
                .count();

        System.out.println("Number of words in the string: " + wordCount);
    }
}