package com.java.basics.concepts;

interface Interf{
    void add(int a, int b);
}
public class MethodReferenceData {

    static void sum(int x, int y){
        System.out.println("The sum is :: "+(x+y));
    }

    public static void main(String[] args) {
        Interf i1 = (a,b)-> System.out.println("The sum is :: "+(a+b));   ////Using lambda Expression
        i1.add(10,20);
 
        Interf i2 = MethodReferenceData::sum;   ////Using Method Reference
        i2.add(200,300);                ///here add method is referencing to sum method
    }
}
