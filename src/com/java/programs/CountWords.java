package com.java.programs;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWords {
    public static void main(String[] args) {
        String s = "My name is Yugal Chaudhari111";
        StringTokenizer  s1 =  new StringTokenizer(s);
        System.out.println( s1.countTokens());

        String [] words = s.split(" ");
        System.out.println(words.length);

        long count = Arrays.stream(words).count();
        System.out.println(count);
    }
}
