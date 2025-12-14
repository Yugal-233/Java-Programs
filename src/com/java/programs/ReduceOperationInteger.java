package com.java.programs;

import java.util.Arrays;
import java.util.List;

public class ReduceOperationInteger {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Integer reduce = numbers.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        Integer reduce2 = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce2);

        Integer orElse = numbers.stream().reduce(Integer::max).orElse(null);
        System.out.println(orElse);

        Integer orElse1 = numbers.stream().reduce(Integer::min).orElse(null);
        System.out.println(orElse1);

        Integer orElse2 = numbers.stream().reduce((a, b) -> a - b).orElse(null);
        System.out.println(orElse2);

        Integer reduce3 = numbers.stream().reduce(0, (c, e) -> c + 1);
        System.out.println(reduce3);

        Integer reduce4 = numbers.stream().reduce(0, (a, b) -> a + b * b);
        System.out.println(reduce4);

        Integer reduce5 = numbers.stream().reduce(0, (a, b) -> b % 2 == 0 ? a + b : a);
        System.out.println(reduce5);

        int oddSum = numbers.stream().reduce(0, (a, b) -> b % 2 != 0 ? a + b : a);
        System.out.println(oddSum);

        Integer reduce6 = numbers.stream().reduce(0, (c, e)->e%2==0?c+1:c);
        System.out.println(reduce6);

    }

}
