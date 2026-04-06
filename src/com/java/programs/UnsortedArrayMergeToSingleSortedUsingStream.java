package com.java.programs;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UnsortedArrayMergeToSingleSortedUsingStream {

    public static void main(String[] args) {

        int[] arr1 = {5, 2, 9, 1};
        int[] arr2 = {8, 3, 7, 4};

        IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().forEach(System.out::println);

        Stream .concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).sorted().mapToInt(Integer::intValue).forEach(System.out::println);
    }
}
