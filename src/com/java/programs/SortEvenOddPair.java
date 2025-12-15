package com.java.programs;

import java.util.*;
import java.util.stream.Collectors;

public class SortEvenOddPair {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(5, 15, 22, 16, 13, 8);

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        // Separate even and odd numbers
        for (Integer num : myList) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);

        Map<Boolean, List<Integer>> collect = myList.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));

        List<Integer> integers = collect.get(true);
        List<Integer> integers1 = collect.get(false);
        System.out.println("\nEven Numbers: " + integers);
        System.out.println("Odd Numbers: " + integers1);
    }
}
