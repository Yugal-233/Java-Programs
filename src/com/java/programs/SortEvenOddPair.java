package com.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        // Sort even and odd numbers
        Collections.sort(evenNumbers);
        Collections.sort(oddNumbers);

        // Interleave even and odd numbers while printing
        int i = 0;
        int j = 0;
        while (i < evenNumbers.size() && j < oddNumbers.size()) {
            System.out.print(evenNumbers.get(i) + " ");
            i++;
            System.out.print(oddNumbers.get(j) + " ");
            j++;
        }
    }
}
