package com.java.basics.concepts;

import java.util.function.IntFunction;

public class IntFunctionData {
    public static void main(String[] args) {
        IntFunction<Integer> f = i->i*i;
        System.out.println(f.apply(4));
    }
}
