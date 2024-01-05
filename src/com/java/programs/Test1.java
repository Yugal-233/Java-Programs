package com.java.programs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        String str = "apple banana apple cherry banana";

        String [] strData = str.split(" ");

        Map<String, Long> collect = Arrays.stream(strData).collect(Collectors.groupingBy(String::toString, Collectors.counting()));

        List<String> collect1 = collect.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect1);

        String s = Arrays.stream(strData).reduce((word1, word2) -> word2 + " " + word1).get();
        System.out.println(s);

        String collect2 = Stream.of(str).map(s1 -> new StringBuffer(str).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(collect2);

        String collect3 = Arrays.stream(strData)
                .map(str1 -> str1.substring(0, 1).toUpperCase() + str1.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(collect3);

        HashSet<String> mySet =  new HashSet<>();
        String collect4 = Arrays.stream(strData).filter(n -> mySet.add(n)).collect(Collectors.joining(" "));
        System.out.println(collect4);

        String output= "";

        for(String str2:strData){
            if(!output.contains(str2)){
                output=output+str2+" ";
            }
        }
        System.out.println(output);

    }
}
