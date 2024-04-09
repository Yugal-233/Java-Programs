package com.java.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,23,56,14,53,89,47,32,56,89);

        Map<Boolean, List<Integer>> collect = myList.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));

        List<Integer> evenList = collect.get(true);
        List<Integer> oddList = collect.get(false);

        System.out.println(evenList);
        System.out.println(oddList);
    }
}
