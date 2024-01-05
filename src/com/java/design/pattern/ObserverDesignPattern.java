package com.java.design.pattern;

import java.util.ArrayList;
import java.util.List;

// Observer
interface EmployeeObserver {
    void update(String employeeName);
}
// Subject (Observable)
class EmployeeManagementSystem {
    private List<EmployeeObserver> observers = new ArrayList<>();
    private String employeeName;

    public void addObserver(EmployeeObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(EmployeeObserver observer) {
        observers.remove(observer);
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        notifyObservers();
    }

    private void notifyObservers() {
        for (EmployeeObserver observer : observers) {
            observer.update(employeeName);
        }
    }
}
// Concrete Observer
class HRDepartment implements EmployeeObserver {
    private String employeeName;

    @Override
    public void update(String employeeName) {
        this.employeeName = employeeName;
        System.out.println("HR Department: Employee " + this.employeeName + " joined the company.");
    }
}

public class ObserverDesignPattern {
    public static void main(String[] args) {
        // Creating subject (observable)
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // Creating observers
        EmployeeObserver hrObserver = new HRDepartment();

        // Registering observers with the subject
    }

}

