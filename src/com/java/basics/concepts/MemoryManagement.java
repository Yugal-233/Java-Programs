package com.java.basics.concepts;

class Xyz{
    String name;

    public Xyz(String name) {
        this.name = name;
    }

    public Xyz() {
    }
}

public class MemoryManagement {
    public static void main(String[] args) {
        Xyz x1 = new Xyz();
        System.out.println(x1.hashCode());
        Xyz x2 =  new Xyz();
        System.out.println(x2.hashCode());

        System.out.println("*******but if we take class of class file, the output is different**********");
        Xyz x3 = new Xyz();
        Class c1 = x3.getClass();
        Xyz x4 = new Xyz();
        Class c2 = x4.getClass();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        ///here even we created the multiple Xyz object, class of class object created only one time, that's why hashcode is same
    }
}
