package com.java.basics.concepts;

interface MethodRefData{
    void display();
}

class MethodRef{
    public static void add(){
        System.out.println("adding the data");
    }

    public static void main(String[] args) {
        MethodRefData m = MethodRef::add;
        m.display();
    }
}