package com.java.basics.concepts;

interface MethodRefData{
    void display();
}

class MethodRef{
    public static int add(){
        System.out.println("adding the data");
        return 10;
    }

    public static void main(String[] args) {
        MethodRefData m = MethodRef::add;
        m.display();
    }
}