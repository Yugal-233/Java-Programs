package com.java.basics.concepts;

interface One{
    void display();
    default void commonMethod(){
        System.out.println("one common method");
    }
}
interface Two{
    void display();
    default void commonMethod(){
        System.out.println("two common method");
    }
}
public class FuncInterfSameDefMethodSuper implements One, Two{
    @Override
    public void display() {
        System.out.println("displaying the data");
    }
    @Override
    public void commonMethod() {
        Two.super.commonMethod();
    }


    public static void main(String[] args) {
        FuncInterfSameDefMethodSuper f =  new FuncInterfSameDefMethodSuper();
        f.display();
        f.commonMethod();
    }
}
