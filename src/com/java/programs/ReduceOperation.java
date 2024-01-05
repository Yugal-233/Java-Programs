package com.java.programs;

import java.util.Arrays;
import java.util.List;

public class ReduceOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 7, 2, 9, 1, 5);

        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);
        System.out.println("Maximum Value: " + max);

        System.out.println("************");
        List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5);
        int sum = elements.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        System.out.println("****************");
        List<String> words = Arrays.asList("Hello", "World", "Java", "8");

        String concatenated = words.stream()
                .reduce((x, y) -> y + ", " + x)
                .orElse("");

        System.out.println("Concatenated String: " + concatenated);
    }
}



