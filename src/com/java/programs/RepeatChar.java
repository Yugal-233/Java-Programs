package com.java.programs;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class RepeatChar {
    public static void main(String[] args) {
        String str = "abbcdefghbda";

        char repeatChar1 = str.chars().mapToObj(c->(char)c).filter(c-> str.indexOf(c)==str.lastIndexOf(c)).findFirst().orElse(' ');
        char repeatChar2 = str.codePoints().mapToObj(c->(char)c).filter(c-> str.indexOf(c)!=str.lastIndexOf(c)).findFirst().orElse(' ');

        if (repeatChar1 != ' ') {
            System.out.println("The first repeated character is: " + repeatChar1);
        } else {
            System.out.println("No repeated character found in the string.");
        }


        Map<Character, Long> collect = str.codePoints().mapToObj(e -> (char) e).collect(groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

        List<Character> collect1 = collect.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).limit(1).collect(Collectors.toList());
        System.out.println(collect1);

    }
}
