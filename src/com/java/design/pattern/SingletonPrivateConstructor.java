package com.java.design.pattern;

class singleTon {

    private static singleTon ref;

    private singleTon() {
        System.out.println("calling private Constructor");
    }

    public static singleTon getInstance() {
        if (ref == null) {
            ref = new singleTon();
        }
        return ref;
    }
}

public class SingletonPrivateConstructor {
    public static void main(String[] args) {singleTon.getInstance();
    }
}