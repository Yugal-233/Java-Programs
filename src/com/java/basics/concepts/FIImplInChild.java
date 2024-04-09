package com.java.basics.concepts;
@FunctionalInterface
interface MyInterf1{
    void display();
}
@FunctionalInterface
interface MyInterf2 extends MyInterf1{
    void display();
}
public class FIImplInChild {
    public static void main(String[] args) {
        MyInterf1 i1 = ()-> System.out.println("Display1");
        i1.display();

        MyInterf2 i2 = ()-> System.out.println("Display2");
        i2.display();
    }

}
