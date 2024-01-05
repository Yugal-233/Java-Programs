package com.java.multithreading;
class SleepThread extends Thread{
    public void run(){
        for (int i = 1; i < 11; i++) {
            System.out.println("Sita thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        SleepThread t = new SleepThread();
        t.start();
        for (int i = 1; i < 11; i++) {
            System.out.println("Ram thread");
        }
    }
}
