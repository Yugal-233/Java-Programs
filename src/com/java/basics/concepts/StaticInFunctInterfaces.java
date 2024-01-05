package com.java.basics.concepts;

@FunctionalInterface
interface StaticInterf{
    void show();
    static void display(){
        System.out.println("static method called display()");
    }
}
public class StaticInFunctInterfaces implements StaticInterf{

    @Override
    public void show() {
        System.out.println("Data show");
    }
    public static void main(String[] args) {
        StaticInterf s1 = new StaticInFunctInterfaces();
        s1.show();
        //s1.display()  will not be allowed, as it's a static method

       //StaticInFunctInterfaces.display() will not be allowed, as it's a static method

        StaticInFunctInterfaces s2 = new StaticInFunctInterfaces();
        s2.show();
        //s2.display();  will not be allowed, as it's a static method

        StaticInterf.display();  ///static method only called by functional interface name


    }
}
