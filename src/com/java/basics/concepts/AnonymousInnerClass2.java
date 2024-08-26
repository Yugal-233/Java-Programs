package com.java.basics.concepts;

class DataDemo{
    public void display(){
        System.out.println("my name is yugal");
    }
}

public class AnonymousInnerClass2 {
    public static void main(String[] args) {

        DataDemo dataDemo =  new DataDemo(){

            @Override
            public void display() {
                System.out.println("my name is Mayur");
            }
        };
        dataDemo.display();
    }
}
