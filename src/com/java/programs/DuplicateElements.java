package com.java.programs;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> myList1 = Arrays.asList(10,20,28,25,75,5,27,18,19,75,20,56,10,83,29,70);

        Set<Integer> myset =  new HashSet<>();
        myList1.stream().filter(n->!myset.add(n)).forEach(System.out::println);

        Map<Integer, Long> mapInt = myList1.stream().collect(Collectors.groupingBy(i->i,LinkedHashMap::new, Collectors.counting()));
        mapInt.forEach((value,count)->{
            if(count>1){
                System.out.println("duplicate integers are :: "+value);
            }else System.out.println("non duplicate integers are :: "+value);
        });

        List<Integer> collect = mapInt.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("**********************************");
        List<String> myList2 = Arrays.asList("Nikita","Yugal", "Mayur", "Sanket","Nikita");
        Set<String> mySet1 = new HashSet<>();
        myList2.stream().filter(n->!mySet1.add(n)).forEach(System.out::println);


        System.out.println("*************************");

        List<String> myList3 = Arrays.asList("Nikita","Yugal", "Mayur", "Sanket","Nikita");
        Map<String, Long> wordCountMap = myList3.stream()
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));

        List<String> duplicates = wordCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicate words: " + duplicates);

    }
}
