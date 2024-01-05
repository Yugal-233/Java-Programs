package com.java.basics.concepts;

abstract class  AbstractClass{
   abstract public void display();
   public void printData(){
       System.out.println("Hi, I am yugal");
   }
}
class Datata extends AbstractClass{
        //only need to override abstract method not concrete method
    @Override
    public void display() {
        System.out.println("Displaying data");
    }
}
public class AbstarctClassDemo {
    public static void main(String[] args) {
        AbstractClass a = new Datata();
        a.display();
        a.printData();
    }
}
