package com.java.basics.concepts;

import java.util.function.Function;

public class FunctionData {
    public static void main(String[] args) {
        Function<Integer,Integer> f = i->i*i;
        System.out.println(f.apply(4));
        System.out.println("*******************************");
        Function<String, Integer> f1 = s->s.length();
        System.out.println(f1.apply("yugal"));
    }
}
