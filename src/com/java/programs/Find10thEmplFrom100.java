package com.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find10thEmplFrom100 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            myList.add(i);
        }
        int max = myList.stream().max(Integer::compare).get();
        System.out.println(max);
        System.out.println(myList);
       int number =  myList.stream().skip(9).findFirst().orElse(null);
        System.out.println(number);

        List<Integer> myList1 = Arrays.asList(10, 20, 60, 54, 30, 12);

        double average = myList1.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0); // Default value if the list is empty

        System.out.println("Average: " + average);
    }
}
