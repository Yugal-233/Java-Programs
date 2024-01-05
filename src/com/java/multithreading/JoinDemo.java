package com.java.multithreading;

class MyThread extends  Thread{
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
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join();
        for (int i = 1; i < 11; i++) {
            System.out.println("Ram thread");
        }
    }
}
