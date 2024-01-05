package com.java.basics.concepts;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class EmployeeDet {
    int salary;
    String name;

    public EmployeeDet(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class BiConsumerData {
    public static void main(String[] args) {
        ArrayList<EmployeeDet> myList = new ArrayList<>();
        BiConsumer<EmployeeDet, Integer> bc = (e, i) -> e.salary = e.salary + i;
        myList.add(new EmployeeDet(1000, "yugal"));
        myList.add(new EmployeeDet(1500, "mayur"));

        for (EmployeeDet e : myList) {
            bc.accept(e, 500);
        }
        for (EmployeeDet e : myList) {
            System.out.println("Empl salary : " + e.salary);
            System.out.println("Empl name : " + e.name);
            System.out.println();
        }
    }
}
