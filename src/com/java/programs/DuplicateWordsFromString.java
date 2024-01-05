package com.java.programs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateWordsFromString {
    public static void main(String[] args) {

        String input = "This is a test test sentence with duplicate duplicate words.";
        String[] words = input.split(" ");
        String output = "";
        List<String> duplicates = new ArrayList<>();

        for (String word : words) {
            if (!output.contains(word)) {
                output = output + word + " ";
            } else {
                if (!duplicates.contains(word)) {
                    duplicates.add(word);
                }
            }
        }
        System.out.println("Original string: " + input);
        System.out.println("String with duplicates removed: " + output);
        System.out.println("Duplicate words: " + duplicates);


        System.out.println("**************************************************************");

        String input1 = "This is a test test sentence with duplicate duplicate words.";
        String [] strData = input1.split(" ");
        String result = Arrays.stream(strData).distinct().collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
