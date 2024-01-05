package com.java.basics.concepts;

interface MyInterf{
    void square(int a);
    default void show(){
        System.out.println("Default method called");
    }
    static void display(){
        System.out.println("static method");
    }
}

public class DefaultAndStaticMethod implements  MyInterf{
    @Override
    public void square(int a) {
        System.out.println(a*a);
    }

    public static void main(String[] args) {
        DefaultAndStaticMethod d = new DefaultAndStaticMethod();
        MyInterf mi =  (a)-> System.out.println(a*a);
        mi.square(8);
        d.square(4);
        d.show();
        mi.show();
        MyInterf.display();
    }
}