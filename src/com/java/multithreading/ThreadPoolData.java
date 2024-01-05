package com.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable{

    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread starts : "+name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread ends");
    }
}

public class ThreadPoolData {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable runnable = new MyRunnable("my worker thread : " + i);
            executorService.execute(runnable);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        System.out.println("All request completed successfully");
    }
}
