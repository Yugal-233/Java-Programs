package com.java.basics.concepts;
class Base {
    public int add(int a, int b) {
        System.out.println("In the base class.");
        return a + b;
    }
    public static void print() {
        System.out.println("In the Base class.");
    }
}
class Derived extends Base {
    public int add(int a, int b) {
        System.out.println("In the child class.");
        return a + b;
    }
    public static void print() {
        System.out.println("In the child class.");
    }
}
public class StaticMethodOverride {
    public static void main(String args[]) {
        Base obj = new Derived();
        System.out.print(obj.add(4, 5));
        obj.print();
    }
}