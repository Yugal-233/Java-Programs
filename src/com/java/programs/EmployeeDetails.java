package com.java.programs;

import java.util.*;
import java.util.Map.Entry;
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
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + ", deptId=" + deptId
                + ", status='" + status + '\'' + '}';
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {

        ArrayList<Employee> myList = new ArrayList<>();
        myList.add(new Employee(101, "mahesh", 50000, 101, "active"));
        myList.add(new Employee(102, "sagar", 170000, 101, "active"));
        myList.add(new Employee(103, "sagar", 170000, 101, "inactive"));
        myList.add(new Employee(104, "yugal", 65000, 102, "inactive"));
        myList.add(new Employee(105, "manav", 70000, 102, "inactive"));
        myList.add(new Employee(106, "yugal", 75000, 102, "active"));
        myList.add(new Employee(107, "radha", 170000, 103, "active"));
        myList.add(new Employee(108, "raghav", 85000, 103, "active"));
        myList.add(new Employee(109, "radha", 170000, 103, "inactive"));
        myList.add(new Employee(110, "krish", 30000, 104, "inactive"));
        myList.add(new Employee(111, "arjun", 45000, 104, "active"));
        myList.add(new Employee(112, "mayuri", 60000, 104, "active"));
        myList.add(new Employee(113, "mayuri", 50000, 104, "inactive"));
        myList.add(new Employee(114, "amit", 120000, 105, "active"));
        myList.add(new Employee(115, "rohan", 90000, 105, "inactive"));
        myList.add(new Employee(116, "kiran", 90000, 105, "active"));
        myList.add(new Employee(117, "lina", 40000, 106, "active"));

        System.out.println("Find all active employees");

        List<Employee> list = myList.stream().filter(empl -> empl.getStatus().equals("active")).toList();
        System.out.println(list);

        System.out.println("Find employees with salary > 80,000.");
        List<Employee> list2 = myList.stream().filter(empl -> empl.getSalary() > 80000).toList();
        System.out.println(list2);

        System.out.println("Count total number of employees");

        long count = myList.stream().count();
        System.out.println(count);

        System.out.println("Count active vs inactive employees.");
        Map<String, Long> collect = myList.stream()
                .collect(Collectors.groupingBy(Employee::getStatus, Collectors.counting()));
        System.out.println(collect);

        System.out.println("Get distinct department IDs");
        Set<Integer> mySet = new HashSet<Integer>();
        List<Integer> list3 = myList.stream().filter(data -> mySet.add(data.getDeptId())).map(Employee::getDeptId)
                .toList();
        System.out.println(list3);
        System.out.println("OR");
        List<Integer> list4 = myList.stream().map(Employee::getDeptId).distinct().toList();
        System.out.println(list4);
        System.out.println("Find employees belonging to a specific department");
        List<Employee> list5 = myList.stream().filter(empl -> empl.getDeptId() == 102).toList();
        System.out.println(list5);
        System.out.println("Sort employees by salary (ascending)");
        List<Employee> list6 = myList.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println(list6);
        System.out.println("Sort employees by salary (descending)");
        List<Employee> list7 = myList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(list7);
        System.out.println("Find the highest paid employee");
        Employee employee = myList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(employee);
        System.out.println("Find the lowest paid employee");
        Employee employee2 = myList.stream().min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(employee2);
        System.out.println("Department-wise employee count");
        Map<Integer, Long> collect2 = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
        System.out.println(collect2);
        System.out.println("Department-wise total salary");
        Map<Integer, Integer> collect3 = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.summingInt(Employee::getSalary)));
        System.out.println(collect3);
        System.out.println("Department-wise average salary");
        Map<Integer, Double> collect4 = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.averagingInt(Employee::getSalary)));
        System.out.println(collect4);
        System.out.println("Group employees by status");

        Map<String, List<Employee>> collect5 = myList.stream().collect(Collectors.groupingBy(Employee::getStatus));
        collect5.forEach((status, empList) -> {
            System.out.println(status + " -> " + empList);
        });
        System.out.println("Nested grouping: dept-wise then status-wise");

        Map<Integer, Map<String, List<Employee>>> collect6 = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.groupingBy(Employee::getStatus)));
        collect6.forEach((dept, myMap) -> {
            System.out.println("dept :" + dept + " Employee :" + myMap);
        });
        System.out.println("Find highest paid employee in each department");
        Map<Integer, Optional<Employee>> collect7 = myList.stream().collect(Collectors.groupingBy(Employee::getDeptId,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        collect7.forEach((deptId, employees) -> {
            System.out.println("deptId :" + deptId + " employees :" + employees);
        });
        System.out.println("Find employees whose salary is above department average");
        Map<Integer, Double> collect8 = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.averagingInt(Employee::getSalary)));

        List<Employee> list8 = myList.stream().filter(empl -> empl.getSalary() > collect8.get(empl.getDeptId()))
                .toList();
        System.out.println(list8);

        System.out.println("Find employees working in multiple departments");
        Map<String, List<Integer>> collect9 = myList.stream().collect(
                Collectors.groupingBy(Employee::getName, Collectors.mapping(Employee::getDeptId, Collectors.toList())));
        List<String> list9 = collect9.entrySet().stream().filter(data -> data.getValue().size() > 1)
                .map(Map.Entry::getKey).toList();
        System.out.println(list9);

        System.out.println("Get top 2 highest paid employees overall");
        List<Employee> list10 = myList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2)
                .toList();
        System.out.println(list10);

        System.out.println("Find the second highest salary (overall)");
        Employee employee3 = myList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1)
                .findFirst().get();
        System.out.println(employee3);

        System.out.println("Find second highest paid employee per department");
        myList.stream().collect(Collectors.groupingBy(Employee::getDeptId)).forEach((deptId, employees) -> {
            employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).limit(1)
                    .forEach(System.out::println);
        });

        System.out.println("Partition employees into ACTIVE and INACTIVE");
        Map<Boolean, List<Employee>> collect10 = myList.stream()
                .collect(Collectors.groupingBy(empl -> empl.getStatus().equals("active")));

        List<Employee> activeEmpl = collect10.get(true);
        List<Employee> inactiveEmpl = collect10.get(false);
        System.out.println(activeEmpl);
        System.out.println(inactiveEmpl);

        System.out.println("Check if all ACTIVE employees earn more than 80,000");
        List<Employee> list11 = myList.stream().filter(empl -> empl.getStatus().equalsIgnoreCase("active"))
                .filter(empl1 -> empl1.getSalary() > 80000).toList();
        System.out.println(list11);
        System.out.println("Find FIRST inactive employee");
        Employee employee4 = myList.stream().filter(e -> "inactive".equalsIgnoreCase(e.getStatus())).findFirst().get();
        System.out.println(employee4);

        System.out.println("Find the department with the highest total salary payout");
        Map<Integer, Integer> collect11 = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.summingInt(Employee::getSalary)));
        Entry<Integer, Integer> max = collect11.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(max);

        System.out.println("Find the department with the highest average salary");
        Map<Integer, Double> collect12 = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.averagingDouble(Employee::getSalary)));
        Entry<Integer, Double> entry = collect12.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(entry);

        System.out.println("Find the department with the second highest average salary");
        Map<Integer, Double> collect13 = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.averagingDouble(Employee::getSalary)));
        Entry<Integer, Double> first = collect13.entrySet().stream()
                .sorted(Map.Entry.<Integer, Double>comparingByValue().reversed()).skip(1).findFirst().get();
        System.out.println(first);

    }
}
