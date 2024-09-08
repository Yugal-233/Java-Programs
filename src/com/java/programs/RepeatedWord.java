package com.java.programs;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatedWord {
    public static void main(String[] args) {
        String str = "apple banana apple cherry banana";

        String[] words = str.split(" ");
        Map<String, Integer> myMap = new HashMap<>();

        String firstRepeated = null;
        for (String word : words) {
            if (myMap.containsKey(word)) {
                firstRepeated = word;
                break;
            }
            myMap.put(word, 1);
        }

        if (firstRepeated != null) {
            System.out.println("The first repeated word is: " + firstRepeated);
        } else {
            System.out.println("No repeated word found in the string.");
        }


        System.out.println("****************Second Approach*********");
        String str1 = "mango apple banana apple cherry banana";

        String [] strData = str1.split(" ");
        List<String> myListData = Arrays.asList(strData);

        LinkedHashSet<String> mySetData = new LinkedHashSet<>();

        String firstRepWord= myListData.stream().filter(wrd->!mySetData.add(wrd)).findFirst().orElse(null);
        System.out.println(firstRepWord);


        System.out.println("******************third approach*************");

        String collect = Arrays.stream(strData).distinct().collect(Collectors.joining(" "));
        System.out.println(collect);

        System.out.println("******************forth approach*************");

        Set<String> mySet = new HashSet<>(myListData);
        List<String> myList = new ArrayList<>(mySet);
        System.out.println(myList);

        System.out.println("******************fifth approach*************");

        List<String> dataList =  new ArrayList<>(new HashSet<>(myListData));
        System.out.println(dataList);
    }
}
