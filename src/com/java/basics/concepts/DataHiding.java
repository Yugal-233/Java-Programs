package com.java.basics.concepts;

class DataHidingMain
{
    public static void method1()
    {
        System.out.println("Method-1 of the DataHidingMain class is executed.");
    }
    public void method2()
    {
        System.out.println("Method-2 of the DataHidingMain class is executed.");
    }
}
public class DataHiding extends DataHidingMain
{
    public static void method1()
    {
        System.out.println("Method-1 of the DataHiding class is executed.");
    }
    public void method2()
    {
        System.out.println("Method-2 of the DataHiding class is executed.");
    }

    public static void main(String args[])
    {
        DataHidingMain d2 = new DataHiding();
        d2.method1();
        d2.method2();
    }
}  