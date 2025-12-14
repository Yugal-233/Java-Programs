package com.java.programs;

import java.util.Arrays;
import java.util.List;

public class ReduceOperationString {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "stream", "reduce", "api");

        System.out.println("************* reverse order of words ************");
        String reduce = words.stream().reduce((a, b) -> b + " " + a).get();
        System.out.println(reduce);

        System.out.println("************* concatenate all words ************");
        String reduce2 = words.stream().reduce("", (a, b) -> a + b);
        System.out.println(reduce2);

        System.out.println("************* concatenate with space ************");
        String result = words.stream().reduce("", (a, b) -> a + " " + b).trim();
        System.out.println(result);

        System.out.println("************* concatenate with comma ************");
        String orElse = words.stream().reduce((a, b) -> a + ", " + b).orElse("");
        System.out.println(orElse);

        System.out.println("************* longest word ************");
        String reduce3 = words.stream().reduce((a, b) -> a.length() >= b.length() ? a : b).get();
        System.out.println(reduce3);

        System.out.println("************* shortest word ************");
        String shortest = words.stream().reduce((a, b) -> a.length() <= b.length() ? a : b).orElse("");
        System.out.println(shortest);

        System.out.println("************* total length of all words ************");
        int totalLength = words.stream().map(String::length).reduce(0, Integer::sum);
        System.out.println(totalLength);

        System.out.println("************* count number of words ************");
        Integer reduce4 = words.stream().reduce(0, (c, e) -> c + 1, Integer::sum);
        System.out.println(reduce4);

        System.out.println("************* uppercase concatenation ************");
        String reduce5 = words.stream().map(data -> data.toUpperCase()).reduce((a, b) -> a + b).get();
        System.out.println(reduce5);

        System.out.println("************* reverse concatenation with space ************");
        String reverse = words.stream().reduce("", (a, b) -> b + " " + a).trim();
        System.out.println(reverse);

    }

}
