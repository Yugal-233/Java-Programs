package com.java.multithreading;

public class DaemonThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread called");
        }else{
            System.out.println("user thread called");
        }
    }
    public static void main(String[] args) {

        DaemonThread d1 =  new DaemonThread();
        d1.setDaemon(true);
        DaemonThread d2 =  new DaemonThread();
        DaemonThread d3 =  new DaemonThread();

        d1.start();
        d2.start();
        d3.start();


    }
}
