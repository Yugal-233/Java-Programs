package com.java.multithreading;

class DisplayData{
    public synchronized void display(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void displayC(){
        for (int i = 65; i <=75 ; i++) {
            System.out.println((char)(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class DisplayThread1 extends Thread{
    DisplayData d =new DisplayData();
    public DisplayThread1(DisplayData d) {
        this.d = d;
    }
    public void run(){
        d.display();
    }
}
class DisplayThread2 extends Thread{
    DisplayData d =new DisplayData();
    public DisplayThread2(DisplayData d) {
        this.d = d;
    }
    public void run(){
        d.displayC();
    }
}
public class SynchrMethod {
    public static void main(String[] args) {
        DisplayData d = new DisplayData();
        DisplayThread1 t1 = new DisplayThread1(d);
        DisplayThread2 t2 = new DisplayThread2(d);
        t1.start();
        t2.start();
    }
}
