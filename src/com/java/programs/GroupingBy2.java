package com.java.programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy2 {
    public static void main(String[] args) {
        List<String> items =Arrays.asList("apple", "apple", "banana","apple", "orange", "banana", "papaya");
        Map<String, Long> collect1 = items.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(collect1);

        Map<String, Long> collect2 = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect2);

        // Sort the items based on the count in descending order
        List<Map.Entry<String, Long>> sortedItems = collect1.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        // Print the results
        for (Map.Entry<String, Long> entry : sortedItems) {
            System.out.println("Item: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
