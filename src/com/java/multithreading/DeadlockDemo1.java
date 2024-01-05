package com.java.multithreading;

public class DeadlockDemo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
    }
}
