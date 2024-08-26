package com.java.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestData {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,23,89,54,45,63,54);

        List<Integer> collect = myList.stream().sorted(Comparator.comparingInt(i -> (int) i).reversed()).skip(2).limit(3).
                collect(Collectors.toList());
        System.out.println(collect);
    }
}
