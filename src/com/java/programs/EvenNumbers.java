package com.java.programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,28,25,75,5,27,20,56,83,29,70);

        myList.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(System.out::println);   //1
        System.out.println("*************************************");
        Predicate<Integer> p = i->i%2==0;               //2
        for (Integer a : myList){
            if(p.test(a)){
                System.out.println(a);
            }
        }
        System.out.println("*************************************");
        myList.stream().filter(i->i%2==0).forEach(System.out::println);         //3
    }
}
