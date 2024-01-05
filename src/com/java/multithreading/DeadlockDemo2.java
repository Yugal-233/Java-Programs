package com.java.multithreading;

public class DeadlockDemo2 {

    public static void main(String[] args) {
        String s1 = "Yugal";
        String s2 = "Mayur";
        Thread t1 = new Thread(){
            public void run() {
                synchronized (s1) {
                    System.out.println("Thread 1 locked s1");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                synchronized (s2){
                    System.out.println("Thread 1 locked s2");
                }
            }
        };

        Thread t2 = new Thread(){
          public void run() {
              synchronized (s2) {
                  System.out.println("Thread 2 locked s2");
                  try {
                      Thread.sleep(2000);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }
              synchronized(s1){
                  System.out.println("Thread 2 locked s1");
              }
          }
        };
        t1.start();
        t2.start();
    }
}
