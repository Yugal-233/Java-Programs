package com.java.multithreading;

class DisplayData1{
    public void display(){
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public synchronized void displayC(){
        synchronized (this) {
            for (int i = 65; i <= 75; i++) {
                System.out.println((char) (i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
class DisplayThread11 extends Thread{
    DisplayData1 d =new DisplayData1();
    public DisplayThread11(DisplayData1 d) {
        this.d = d;
    }
    public void run(){
        d.display();
    }
}
class DisplayThread22 extends Thread{
    DisplayData1 d =new DisplayData1();
    public DisplayThread22(DisplayData1 d) {
        this.d = d;
    }
    public void run(){
        d.displayC();
    }
}
public class SynchrBlock {
    public static void main(String[] args) {
        DisplayData1 d = new DisplayData1();
        DisplayThread11 t1 = new DisplayThread11(d);
        DisplayThread22 t2 = new DisplayThread22(d);
        t1.start();
        t2.start();
    }
}
