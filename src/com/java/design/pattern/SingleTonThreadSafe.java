package com.java.design.pattern;

class SingleTonThreadSafeDP{

    public static SingleTonThreadSafeDP ref;
    private SingleTonThreadSafeDP(){
    }
    public static SingleTonThreadSafeDP getInstance(){
        if(ref==null){
            synchronized (SingleTonThreadSafeDP.class){
                if (ref==null) {
                    ref= new SingleTonThreadSafeDP();
                }
            }
        }
        return ref;
    }
}

public class SingleTonThreadSafe {

    public static void main(String[] args) {

        SingleTonThreadSafeDP s1 = SingleTonThreadSafeDP.getInstance();
        SingleTonThreadSafeDP s2 = SingleTonThreadSafeDP.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
