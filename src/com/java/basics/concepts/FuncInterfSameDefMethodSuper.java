package com.java.basics.concepts;

interface One{
    default void commonMethod(){
        System.out.println("one common method");
    }
}
interface Two{
    default void commonMethod(){
        System.out.println("two common method");
    }
}
public class FuncInterfSameDefMethodSuper implements One, Two{
    @Override
    public void commonMethod() {
        Two.super.commonMethod();
    }


    public static void main(String[] args) {
        FuncInterfSameDefMethodSuper f =  new FuncInterfSameDefMethodSuper();
        f.commonMethod();
    }
}
