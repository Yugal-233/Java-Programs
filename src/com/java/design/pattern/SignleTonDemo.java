package com.java.design.pattern;

class SingleTonClass{

    private static SingleTonClass ref;
    private SingleTonClass(){
        System.out.println("SingleTon constructor called");
    }
    public static SingleTonClass getInstance(){
        if(ref==null){
            ref= new SingleTonClass();
        }
        return ref;
    }
}
public class SignleTonDemo {
    public static void main(String[] args) {
        SingleTonClass.getInstance();

        SingleTonClass s1 = SingleTonClass.getInstance();
        System.out.println(s1.hashCode());

        SingleTonClass s2 = SingleTonClass.getInstance();
        System.out.println(s2.hashCode());
    }
}
