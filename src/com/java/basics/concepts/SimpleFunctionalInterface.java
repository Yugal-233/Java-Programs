package com.java.basics.concepts;

interface SimpleFuncInterface{
    void display();
}
public class SimpleFunctionalInterface {
    public static void main(String[] args) {
        SimpleFuncInterface s = ()-> System.out.println("my name is Yugal");
        s.display();
    }
}
