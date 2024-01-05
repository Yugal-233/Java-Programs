package com.java.programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int next;
        for (int i = 0; i <=10 ; i++) {
            System.out.println(num1);       //0 1 2 3 4 5 6 7 8 9 10
            next = num1 + num2;
            num1 = num2;
            num2 = next;
        }

        System.out.println("************second way*************");

        List<Integer> myList = Stream.iterate(new int[]{0,1}, t->new int[]{t[1],t[0]+t[1]})
                .limit(10)
                .map(t->t[0])
                .collect(Collectors.toList());
        System.out.println(myList);
        
    }
}
