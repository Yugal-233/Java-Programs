package com.java.programs;

record RecordEmployee(int id, String name, String department) {
}

public class RecordEmployeeData {
    public static void main(String[] args) {
        RecordEmployee employee1 = new RecordEmployee(1, "Alice", "HR");
        RecordEmployee employee2 = new RecordEmployee(2, "Bob", "IT");

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("Employee 1 Name: " + employee1.name());
        System.out.println("Employee 2 Department: " + employee2.department());
    }
}
