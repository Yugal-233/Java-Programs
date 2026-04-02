package com.java.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatWordCount {

    public static void main(String[] args) {
        String str = "AASS BBSS CCSS AASS";
        String[] words = str.split(" ");

        HashMap<String, Integer> myMap = new HashMap<>();

        for (String word : words) {
            if (myMap.containsKey(word)) {
                myMap.put(word, myMap.get(word) + 1);
            } else myMap.put(word, 1);
        }
        for (Map.Entry<String, Integer> myEntry : myMap.entrySet()) {
            System.out.println(myEntry.getKey() + "  " + myEntry.getValue());
        }

        System.out.println("*****************************");

        String[] strData = str.split(" ");

        String result = Arrays.stream(strData)
                .map(word -> word.substring(0, 1).toLowerCase() + word.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(result);

        System.out.println("*****************************");
        Arrays.stream(strData).collect(Collectors.groupingBy(word -> word, LinkedHashMap::new, Collectors.counting()))
                .forEach((word, count) -> System.out.println(word + "  " + count));
    }
}
