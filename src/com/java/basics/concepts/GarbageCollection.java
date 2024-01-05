package com.java.basics.concepts;

public class GarbageCollection {
    public void finalise(){
        System.out.println("Garbage collection finalise method is called.");
    }
    public static void main(String[] args) {
        GarbageCollection g1 = new GarbageCollection();
        GarbageCollection g2 = new GarbageCollection();

        g1= null;
        g2= null;
        System.gc();

        System.out.println("yugal"=="yugal");

        String s1 =  new String("mayur");
        String s2 =  new String("mayur");
        System.out.println(s1.equals(s2));

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        System.out.println(t1.equals(t2));
    }
}
