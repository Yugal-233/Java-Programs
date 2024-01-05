package com.java.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingReverseOrder {
    public static void main(String[] args) {
        List<Integer> myList1 = Arrays.asList(10,20,28,25,75,5,27,18,19,75,20,56,10,83,29,70);

        myList1.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        System.out.println("**********************************");
        List<Integer> revList=  myList1.stream().sorted((e1,e2)->e1<e2?1:e1>e2?-1:0).collect(Collectors.toList());
        System.out.println(revList);
        System.out.println("**********************************");
        myList1.stream().sorted((e1, e2)->e1<e2?1:e1>e2?-1:0).forEach(System.out::println);


        System.out.println("********reverse string*********");
        String s = "My name is Yugal";
        String [] strArr = s.split(" ");
       String strOut =  Arrays.stream(strArr).reduce( ((word1,word2)->word2+" "+word1)).orElse("");
        System.out.println(strOut);
    }
}
