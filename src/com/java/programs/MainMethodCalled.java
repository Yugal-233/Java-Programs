package com.java.programs;

interface MyInterf{
    public static void main(String[] args) {
        System.out.println("Main method called");
    }
}
public class MainMethodCalled {
    public static void main(String[] args) {
        MyInterf.main(new String[]{"Radha"});
    }
}
