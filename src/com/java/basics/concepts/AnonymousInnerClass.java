package com.java.basics.concepts;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i=1;i<=10;i++){
                System.out.println("Child thread is running");
            }
        };

        Thread t  = new Thread(r);
        t.start();
        for (int i = 1; i <=10; i++) {
            System.out.println("Main thread is running");
        }
    }
}