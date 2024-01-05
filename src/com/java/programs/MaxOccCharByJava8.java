package com.java.programs;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MaxOccCharByJava8 {
    public static void main(String[] args) {
        String s ="my name is yugal chaudhari and I am a sofyware engineer";
        s=s.replaceAll("\\s","");

        Map<Character, Long> collect = s.codePoints().mapToObj(e -> (char) e).collect(groupingBy(e -> e, Collectors.counting()));
        System.out.println(collect);

        collect.forEach((character, count) ->
                System.out.println("'" + character + "': " + count + " times"));

        Map.Entry<Character, Long> entry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
        if(entry!=null){
            System.out.println("max occurring char : "+entry.getKey());
            System.out.println("max frequency of char: "+entry.getValue());
        }

        Map<Character, Long> collect1 = s.chars().mapToObj(e -> (char) e).collect(groupingBy(e -> e, counting()));
        System.out.println(collect1);

        Map<Character, Long> collect2 = s.codePoints().mapToObj(e -> (char) e).collect(groupingBy(Function.identity(), counting()));
        System.out.println(collect2);

        Map<Character, Long> collect3 = s.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect3);
    }
}
