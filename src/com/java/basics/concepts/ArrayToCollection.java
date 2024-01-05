package com.java.basics.concepts;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayToCollection {
    public static void main(String args[])
    {
        String[] playersArray = { "Virat", "Sachin", "Rohit", "Bumrah" };
        List playersList = Arrays.asList(playersArray);
        System.out.println("Converted elements: "+ playersList);

        Integer [] i = {10,20,30,40};
        List<Integer> myInt = Arrays.asList(i);
        System.out.println(myInt);

        Integer [] i2 = {10,20,15,32,78,93,30,40};
        Integer[] sortedArray = Arrays.stream(i2).sorted().toArray(Integer[]::new);
        System.out.println(Arrays.toString(sortedArray));

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(5);
        myList.add(50);
        myList.add(45);

        // Sorting using Java 8 Stream API
        List<Integer> sortedList = myList.stream()
                .sorted((a,b)->b-a)
                .collect(Collectors.toList());

        // Print the sorted list
        System.out.println(sortedList);
    }
}
