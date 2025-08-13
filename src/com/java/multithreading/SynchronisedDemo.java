package com.java.multithreading;

class Display{
    public  void wish(String name) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning: "+name);
            Thread.sleep(1000);
        }
    }
}
class ThreadData extends Thread{
    Display d;
    String name;

    public ThreadData(Display d, String name) {
        this.d = d;
        this.name = name;
    }
    public void run(){
        try {
            d.wish(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class SynchronisedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        ThreadData t1 = new ThreadData(d,"Dhoni");
        ThreadData t2 = new ThreadData(d,"Yuvraj");
        ThreadData t3 = new ThreadData(d,"Raghav");
        t1.start();
        t2.start();
        t3.start();
    }
}
