package com.java.programs;

import java.util.Arrays;
import java.util.List;

public class StartingWithNameOrNumber {
    public static void main(String[] args) {
        List<Integer> myList1 = Arrays.asList(10,28,25,75,5,27,18,19,20,56,83,29,70);

        List<String> myList2 = Arrays.asList("Pritam","Yugal", "Mayur", "Sanket");

        myList1.stream().map(s->s.toString()).filter(i->i.startsWith("1")).forEach(System.out::println);
        myList2.stream().filter(s->s.startsWith("N")).forEach(System.out::println);
    }

}
