package com.java.basics.concepts;

import java.util.function.UnaryOperator;

public class UnaryOperatorData {
    public static void main(String[] args) {
        UnaryOperator<Integer> f = i->i*i;
        System.out.println(f.apply(8));
    }
}
