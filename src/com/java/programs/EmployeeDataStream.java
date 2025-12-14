package com.java.programs;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    int salary;
    int deptId;
    String status;

    public Employee(int id, String name, int salary, int deptId, String status) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deptId = deptId;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", deptId=" + deptId +
                ", status='" + status + '\'' +
                '}';
    }
}

public class EmployeeDataStream {
    public static void main(String[] args) {

        ArrayList<Employee> myList = new ArrayList<>();
        myList.add(new Employee(101, "mahesh", 50000, 101, "active"));
        myList.add(new Employee(102, "sagar", 170000, 101, "active"));
        myList.add(new Employee(103, "yugal", 65000, 102, "inactive"));
        myList.add(new Employee(104, "manav", 70000, 102, "inactive"));
        myList.add(new Employee(105, "radha", 170000, 103, "active"));
        myList.add(new Employee(106, "raghav", 85000, 103, "active"));
        myList.add(new Employee(107, "krish", 30000, 104, "inactive"));

        System.out.println("************* sort by salary ascending ************");
        List<Employee> collect1 = myList.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(collect1);

        System.out.println("************* sort by salary descending ************");
        List<Employee> collect2 = myList.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println(collect2);

        System.out.println("************* employees with salary > 60000 ************");
        Map<String, Integer> highSalaryEmployees = myList.stream()
                .filter(e -> e.getSalary() > 60000)
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println(highSalaryEmployees);

        System.out.println("************* second highest salary employee ************");
        Employee secondHighestSalaryEmployee = myList.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondHighestSalaryEmployee);

        System.out.println("************* sort by salary desc then name desc ************");
        myList.sort(Comparator.comparing(Employee::getSalary).reversed()
                .thenComparing(Comparator.comparing(Employee::getName).reversed()));
        myList.forEach(System.out::println);

        System.out.println("************* sort by salary asc then name asc ************");
        myList.sort(Comparator.comparing(Employee::getSalary)
                .thenComparing(Employee::getName));
        myList.forEach(System.out::println);

        System.out.println("************* custom comparator salary desc ************");
        myList.stream()
                .sorted((e1, e2) -> e1.salary > e2.salary ? -1 : e1.salary < e2.salary ? 1 : 0)
                .forEach(System.out::println);

        System.out.println("************* filter salary >= 70000 ************");
        myList.stream()
                .filter(e -> e.salary >= 70000)
                .forEach(System.out::println);

        System.out.println("************* highest salary using limit ************");
        myList.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .limit(1)
                .forEach(System.out::println);

        System.out.println("************* third highest salary ************");
        myList.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .skip(2)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("************* predicate example salary > 70000 ************");
        Predicate<Employee> p = emp -> emp.salary > 70000;
        for (Employee e : myList) {
            if (p.test(e)) {
                System.out.println(e.name + " : " + e.salary);
            }
        }

        System.out.println("************* minimum salary employee ************");
        Employee minValue = myList.stream()
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
        System.out.println(minValue);

        System.out.println("************* maximum salary employee ************");
        Employee maxValue = myList.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
        System.out.println(maxValue);

        System.out.println("************* group employees by department ************");
        Map<Integer, List<Employee>> empMap = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId));
        empMap.forEach((k, v) -> System.out.println("Dept " + k + " -> " + v));

        System.out.println("************* group by department with employee names set ************");
        Map<Integer, Set<String>> empSet = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId,
                        Collectors.mapping(Employee::getName, Collectors.toSet())));
        System.out.println(empSet);

        System.out.println("************* group by department with employee names list ************");
        Map<Integer, List<String>> empList = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(empList);

        System.out.println("************* employee count per department ************");
        Map<Integer, Long> empCount = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
        System.out.println(empCount);

        System.out.println("************* active and inactive employee count ************");
        long activeEmp = myList.stream().filter(e -> e.getStatus().equalsIgnoreCase("active")).count();
        long inactiveEmp = myList.stream().filter(e -> e.getStatus().equalsIgnoreCase("inactive")).count();
        System.out.println("active=" + activeEmp + ", inactive=" + inactiveEmp);

        System.out.println("************* max salary employee overall ************");
        System.out.println(myList.stream().max(Comparator.comparingInt(Employee::getSalary)));

        System.out.println("************* min salary employee overall ************");
        System.out.println(myList.stream().min(Comparator.comparingInt(Employee::getSalary)));

        System.out.println("************* max salary per department ************");
        Map<Integer, Optional<Employee>> maxSalEmp = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId,
                        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        System.out.println(maxSalEmp);

        System.out.println("************* total salary of department 101 ************");
        int totalSalary = myList.stream()
                .filter(e -> e.getDeptId() == 101)
                .map(Employee::getSalary)
                .reduce(0, Integer::sum);
        System.out.println(totalSalary);

        System.out.println("************* average salary of department 101 ************");
        double avgSalary = myList.stream()
                .filter(e -> e.getDeptId() == 101)
                .mapToInt(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println(avgSalary);

        System.out.println("************* second highest salary per department ************");
        myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId))
                .forEach((dept, employees) -> employees.stream()
                        .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                        .skip(1)
                        .limit(1)
                        .forEach(e -> System.out.println("Dept " + dept + " -> " + e.getName() + " : " + e.getSalary())));

        System.out.println("************* treemap sorting by key ************");
        Map<String, String> myMap = new HashMap<>();
        myMap.put("red", "rd");
        myMap.put("blue", "bl");
        myMap.put("yellow", "yl");
        myMap.put("orange", "or");
        myMap.put("grey", "gr");
        myMap.put("green", "gn");
        new TreeMap<>(myMap).forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
