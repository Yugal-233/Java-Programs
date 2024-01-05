package com.java.basics.concepts;

class Animal{
    int a=100;
    public void sound(){
        System.out.println("animal barking");
    }
}
class Dog extends Animal{

    int a=10;
    public void sound(){
        int a=30;
        System.out.println("dog barking");
        System.out.println("value : "+a);
        System.out.println("this value : "+this.a);
        System.out.println("super value : "+super.a);
        super.sound();
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a =  new Dog();
        a.sound();
    }
}
