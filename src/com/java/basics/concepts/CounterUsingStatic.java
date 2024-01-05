package com.java.basics.concepts;

public class CounterUsingStatic {
    static int count=0;

    public CounterUsingStatic(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        CounterUsingStatic c1 =  new CounterUsingStatic();
        CounterUsingStatic c2 =  new CounterUsingStatic();
        CounterUsingStatic c3 =  new CounterUsingStatic();
        CounterUsingStatic c4 =  new CounterUsingStatic();
    }
}
