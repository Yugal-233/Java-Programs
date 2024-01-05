package com.java.design.pattern;

interface Employee{
    int salary();
}
class AndroidDeveloper implements  Employee{
    @Override
    public int salary() {
        System.out.println("AndroidDeveloper salary is printed");
        return 844444;
    }
}
class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("WebDeveloper salary is printed");
        return 9888888;
    }
}

class FactoryDesignPattern{

    static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("ANDROID")){
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("WEB")) {
            return new WebDeveloper();
        }else return null;
    }
}

public class FactoryDesignPatternDemo {

    public static void main(String[] args) {
        Employee emp1 = FactoryDesignPattern.getEmployee("ANDROID");
        System.out.println(emp1.salary());

        Employee emp2 = FactoryDesignPattern.getEmployee("WEB");
        System.out.println(emp2.salary());
    }
}
