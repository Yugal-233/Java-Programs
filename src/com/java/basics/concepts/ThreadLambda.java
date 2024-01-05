package com.java.basics.concepts;

public class ThreadLambda {
    public static void main(String[] args) {
        Thread t =  new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        });
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
