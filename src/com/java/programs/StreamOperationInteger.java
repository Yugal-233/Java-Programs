package com.java.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperationInteger {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6);

        System.out.println("************* elements greater than 2 ************");
        numbers.stream().filter(n -> n > 2).forEach(System.out::println);

        System.out.println("************* multiply each element by 2 ************");
        numbers.stream().map(n -> n * 2).forEach(System.out::println);

        System.out.println("************* flatten nested lists ************");
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );
        list.stream().flatMap(l -> l.stream()).forEach(System.out::println);

        System.out.println("************* remove duplicate elements ************");
        numbers.stream().distinct().forEach(System.out::println);

        System.out.println("************* sort elements in descending order ************");
        numbers.stream().sorted((a, b) -> b - a).forEach(System.out::println);

        System.out.println("************* first 3 elements ************");
        numbers.stream().limit(3).forEach(System.out::println);

        System.out.println("************* top 3 largest elements ************");
        numbers.stream().sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);

        System.out.println("************* skip first 2 elements ************");
        numbers.stream().skip(2).forEach(System.out::println);

        System.out.println("************* peek and filter elements greater than 3 ************");
        numbers.stream()
                .peek(System.out::println)
                .filter(n -> n > 3)
                .forEach(System.out::println);

        System.out.println("************* print all elements ************");
        numbers.stream().forEach(System.out::println);

        System.out.println("************* parallel stream with order ************");
        numbers.parallelStream().forEachOrdered(System.out::println);

        System.out.println("************* collect elements into list ************");
        List<Integer> collectedList = numbers.stream().collect(Collectors.toList());
        System.out.println(collectedList);

        System.out.println("************* sum using reduce ************");
        int sumUsingReduce = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sumUsingReduce);

        System.out.println("************* count elements ************");
        long count = numbers.stream().count();
        System.out.println(count);

        System.out.println("************* minimum element ************");
        int min = numbers.stream().min(Integer::compare).orElse(0);
        System.out.println(min);

        System.out.println("************* maximum element ************");
        int max = numbers.stream().max(Integer::compare).orElse(0);
        System.out.println(max);

        System.out.println("************* first element ************");
        int first = numbers.stream().findFirst().orElse(0);
        System.out.println(first);

        System.out.println("************* any element ************");
        int any = numbers.stream().findAny().orElse(0);
        System.out.println(any);

        System.out.println("************* check if any even number exists ************");
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(anyEven);

        System.out.println("************* convert Integer to int ************");
        numbers.stream().mapToInt(Integer::intValue).forEach(System.out::println);

        System.out.println("************* sum using IntStream ************");
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        System.out.println("************* average of elements ************");
        double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(avg);

        System.out.println("************* summary statistics ************");
        IntSummaryStatistics stats =
                numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(stats);

        System.out.println("************* boxed stream ************");
        IntStream.range(1, 5).boxed().forEach(System.out::println);

        System.out.println("************* parallel stream ************");
        numbers.parallelStream().forEach(System.out::println);

        System.out.println("************* sequential stream ************");
        numbers.parallelStream().sequential().forEach(System.out::println);
    }
}
