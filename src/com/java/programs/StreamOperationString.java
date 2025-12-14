package com.java.programs;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOperationString {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "stream", "api", "reduce", "java", "code");

        System.out.println("************* filter length > 3 ************");
        words.stream().filter(w -> w.length() > 3).forEach(System.out::println);

        System.out.println("************* map to upper case ************");
        words.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("************* map to length ************");
        words.stream().map(String::length).forEach(System.out::println);

        System.out.println("************* distinct ************");
        words.stream().distinct().forEach(System.out::println);

        System.out.println("************* sorted natural order ************");
        words.stream().sorted().forEach(System.out::println);

        System.out.println("************* sorted by length ************");
        words.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        System.out.println("************* limit 3 ************");
        words.stream().limit(3).forEach(System.out::println);

        System.out.println("************* skip 2 ************");
        words.stream().skip(2).forEach(System.out::println);

        System.out.println("************* peek with filter ************");
        words.stream().peek(System.out::println).filter(w -> w.length() > 3).forEach(System.out::println);

        System.out.println("************* collect to list ************");
        List<String> list = words.stream().collect(Collectors.toList());
        System.out.println(list);

        System.out.println("************* collect to set ************");
        Set<String> set = words.stream().collect(Collectors.toSet());
        System.out.println(set);

        System.out.println("************* collect to map (string -> length) ************");
        Map<String, Integer> map =
                words.stream().distinct()
                        .collect(Collectors.toMap(w -> w, String::length));
        System.out.println(map);

        System.out.println("************* reduce concatenate ************");
        String concat = words.stream().reduce("", (a, b) -> a + b);
        System.out.println(concat);

        System.out.println("************* reduce longest string ************");
        String longest =
                words.stream()
                        .reduce((a, b) -> a.length() >= b.length() ? a : b)
                        .orElse("");
        System.out.println(longest);

        System.out.println("************* reduce shortest string ************");
        String shortest =
                words.stream()
                        .reduce((a, b) -> a.length() <= b.length() ? a : b)
                        .orElse("");
        System.out.println(shortest);

        System.out.println("************* count ************");
        long count = words.stream().count();
        System.out.println(count);

        System.out.println("************* min lexicographically ************");
        String min = words.stream().min(String::compareTo).orElse("");
        System.out.println(min);

        System.out.println("************* max by length ************");
        String max = words.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println(max);

        System.out.println("************* find first ************");
        String first = words.stream().findFirst().orElse("");
        System.out.println(first);

        System.out.println("************* find any ************");
        String any = words.stream().findAny().orElse("");
        System.out.println(any);

        System.out.println("************* anyMatch starts with j ************");
        boolean anyMatch = words.stream().anyMatch(w -> w.startsWith("j"));
        System.out.println(anyMatch);

        System.out.println("************* allMatch lowercase ************");
        boolean allMatch = words.stream().allMatch(w -> w.equals(w.toLowerCase()));
        System.out.println(allMatch);

        System.out.println("************* noneMatch empty ************");
        boolean noneMatch = words.stream().noneMatch(String::isEmpty);
        System.out.println(noneMatch);

        System.out.println("************* joining with comma ************");
        String joined = words.stream().collect(Collectors.joining(", "));
        System.out.println(joined);

        System.out.println("************* grouping by length ************");
        Map<Integer, List<String>> groupByLength =
                words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupByLength);

        System.out.println("************* frequency count ************");
        Map<String, Long> frequency =
                words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(frequency);

        System.out.println("************* partitioning by length > 3 ************");
        Map<Boolean, List<String>> partition =
                words.stream().collect(Collectors.partitioningBy(w -> w.length() > 3));
        System.out.println(partition);

        System.out.println("************* flatMap example ************");
        List<List<String>> nested =
                Arrays.asList(Arrays.asList("java", "code"), Arrays.asList("stream", "api"));
        nested.stream().flatMap(l -> l.stream()).forEach(System.out::println);

        System.out.println("************* parallel stream ************");
        words.parallelStream().forEach(System.out::println);

        System.out.println("************* parallel stream ordered ************");
        words.parallelStream().forEachOrdered(System.out::println);
    }
}
