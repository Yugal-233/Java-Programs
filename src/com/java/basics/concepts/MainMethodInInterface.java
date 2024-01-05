package com.java.basics.concepts;

interface InterfaceCallingMainMethod{
   public static void main(String[] args) {
        System.out.println("Main method calling from the interface");
    }
}
public class MainMethodInInterface {
    public static void main(String[] args) {
        InterfaceCallingMainMethod.main(new String[]{"Hi"});
    }
}
