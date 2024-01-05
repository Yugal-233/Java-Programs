package com.java.basics.concepts;

import java.util.ArrayList;
import java.util.Collections;
interface Shape{
    void draw();
}
interface Data{
    int add(int a, int b);
}
public class LambdaExpression {
    public static void main(String[] args) {
        Shape s = ()-> System.out.println("Drawing rectangle shape");
        s.draw();

        Data d = (a,b)-> a+b;
        System.out.println("The sum is :: "+d.add(10,20));

        ArrayList<Integer> myList  = new ArrayList<>();
        myList.add(10);
        myList.add(5);
        myList.add(50);
        myList.add(45);

        Collections.sort(myList);
        myList.stream().forEach(System.out::println);
        System.out.println("*******************************");
        myList.stream().sorted().forEach(System.out::println);
        System.out.println("*******************************");
        myList.stream().filter(a->a%2==0).forEach(System.out::println);
    }
}