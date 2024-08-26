package com.java.basics.concepts;
class Base {
    public static void print() {
        System.out.println("In the Base class.");
    }
}
class Derived extends Base {
    public static void print() {
        System.out.println("In the child class.");
    }
}
public class StaticMethodOverride {
    public static void main(String args[]) {
        Base obj = new Derived();
        obj.print();
    }
}