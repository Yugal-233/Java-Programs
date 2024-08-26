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
    public void setName(String name) {
        this.name = name;
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
//class myComp implements Comparator<Employee>{
//
//
//    @Override
//    public int compare(Employee e1, Employee e2) {
//        if (e1.salary>e2.salary) {
//            return -1;
//        }
//        else if (e1.salary<e2.salary) {
//            return 1;
//        }
//        else
//            return 0;
//    }
//}

public class EmployeeDataStream {
    public static void main(String[] args) {

        ArrayList<Employee> myList = new ArrayList<>();
        myList.add(new Employee(101, "mahesh", 50000, 101, "active"));
        myList.add(new Employee(102, "sagar", 170000, 101, "active"));
        myList.add(new Employee(103, "yugal", 65000, 102, "inactive"));
        myList.add(new Employee(104, "nikita", 70000, 102, "inactive"));
        myList.add(new Employee(105, "radha", 170000, 103, "active"));
        myList.add(new Employee(106, "raghav", 85000, 103, "active"));
        myList.add(new Employee(107, "bhavana", 30000, 104, "inactive"));

        List<Employee> collect1 =
                myList.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("****************************************");
        List<Employee> collect2 =
                myList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(collect2);

        System.out.println("****************employee.getSalary() > 10000**************************");
        Map<String, Integer> highSalaryEmployees = myList.stream()
                        .filter(empl->empl.getSalary()>60000)
                                .collect(Collectors.toMap(Employee::getName,Employee::getSalary));
        System.out.println(highSalaryEmployees);


        System.out.println("*************second highest salary employee*****************");
        Employee secondHighestSalaryEmployee = myList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .distinct()
                .findFirst()
                .orElse(null);
        System.out.println(secondHighestSalaryEmployee);

        System.out.println("********************Sort by salary (descending) and then by name (descending)**********************");
        myList.sort(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Comparator.comparing(Employee::getName).reversed()));
        myList.forEach(System.out::println);

        System.out.println("********************Sort by salary and then by name**********************");
        myList.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
        myList.forEach(System.out::println);

        System.out.println("......................................................");
        myList.stream().sorted((e1, e2) -> e1.salary > e2.salary ? -1 : e1.salary < e2.salary ? 1 : 0).forEach(employee -> System.out.println(employee));

        System.out.println("......................................................");
        myList.stream().filter(employee -> employee.salary >= 70000).forEach(employee -> System.out.println(employee));

        System.out.println("..........................limit............................");
        myList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).limit(1).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("............................third salary..........................");
        myList.stream().sorted((e1, e2) -> e1.salary > e2.salary ? -1 : e1.salary < e2.salary ? 1 : 0).skip(2).limit(1).forEach(employee -> System.out.println(employee));

        System.out.println("............................third salary..........................");
        myList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(2).limit(1).collect(Collectors.toList());

        System.out.println("......................................................");
        Predicate<Employee> p = emp1 -> emp1.salary > 70000;
        for (Employee e : myList) {
            if (p.test(e)) {
                System.out.println(e.name + " : " + e.salary);
            }
        }

        System.out.println("......................................................");
        Employee minValue = myList.stream().min((e1, e2) -> e1.salary < e2.salary ? -1 : e1.salary > e2.salary ? 1 : 0).get();
        System.out.println("minValue : " + minValue.salary + " His name :: " + minValue.name);

        System.out.println("......................................................");
        Employee minValue1 = myList.stream().min(Comparator.comparingInt(Employee::getSalary)).get();
        System.out.println("minValue : " + minValue1.salary + " His name :: " + minValue1.name);


        System.out.println("......................................................");
        Employee maxValue = myList.stream().max((e1, e2) -> e1.salary < e2.salary ? -1 : e1.salary > e2.salary ? 1 : 0).get();
        System.out.println("maxValue : " + maxValue.salary + " His name :: " + maxValue.name);

        System.out.println("**********************Gruping by**************");
        Map<Integer, List<Employee>> empMap=myList.stream().collect(Collectors.groupingBy(s->s.getDeptId()));
        empMap.entrySet().forEach(result->{
            System.out.println("key: "+result.getKey()+" Value: "+result.getValue());
        });
        System.out.println("**********************Gruping by**************");
        Map<Integer, List<Employee>> empMap1=myList.stream().collect(Collectors.groupingBy(Employee::getDeptId));
        empMap1.forEach((key, value) -> System.out.println("key: " + key + " Value: " + value));


        System.out.println("**********************Gruping by**************");
        Map<Integer, Set<String>> empSet=myList.stream().collect(Collectors.groupingBy(s->s.getDeptId(),Collectors.mapping(Employee::getName, Collectors.toSet())));
        System.out.println(empSet);

        System.out.println("************************************");
        Map<Integer,List<String>> empList=myList.stream().collect(Collectors.groupingBy(s->s.getDeptId(),Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(empList);

        System.out.println("************************************");
        HashMap<Integer, List<String>> empHashMap1=myList.stream().collect(Collectors.groupingBy(s->s.getDeptId(), HashMap::new, Collectors.mapping(Employee::getName , Collectors.toList())));
        System.out.println(empHashMap1);

        System.out.println("************************************");
        Hashtable<Integer, List<String>> empHashTable=myList.stream().collect(Collectors.groupingBy(s->s.getDeptId(), Hashtable::new, Collectors.mapping(Employee::getName , Collectors.toList())));
        System.out.println(empHashTable);

        System.out.println("****************empHashMap2********************");
        HashMap<Integer, List<String>> empHashMap2=myList.stream().collect(Collectors.groupingBy(s->s.getDeptId(), ()->new HashMap<>(), Collectors.mapping(Employee::getName , Collectors.toList())));
        System.out.println(empHashMap2);

        System.out.println("************************************");
        Map<Integer, Long> empCount = myList.stream().collect(Collectors.groupingBy(s->s.getDeptId(), Collectors.counting()));
        System.out.println(empCount);

        System.out.println("************************************");
        Map<Integer, Integer> empSum = myList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.summingInt(Employee::getDeptId)));
        System.out.println(empSum);

        System.out.println("************************************");
        long activeEmp= myList.stream().filter(s->s.getStatus().equalsIgnoreCase("active")).count();
        long inActiveEmp= myList.stream().filter(s->s.getStatus().equalsIgnoreCase("inactive")).count();
        System.out.println("active: "+activeEmp);
        System.out.println("inactive: "+inActiveEmp);

        System.out.println("*****************Max and min salary*******************");
        Optional<Employee> maxEmp =myList.stream().max(Comparator.comparingInt(Employee::getSalary));
        System.out.println(maxEmp);

        Optional<Employee> minEmp =myList.stream().min(Comparator.comparingInt(Employee::getSalary));
        System.out.println(minEmp);

        System.out.println("*****************Max salary from each dep*******************");
        Map<Integer, Optional<Employee>> maxSalEmp1 =myList.stream().collect(Collectors.groupingBy(s->s.getDeptId(), Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        System.out.println(maxSalEmp1);
        System.out.println("*****************Max salary from each dep second way*******************");
        Map<Integer, Optional<Employee>> maxSalEmp2 =myList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
        System.out.println(maxSalEmp2);

        System.out.println("*****Total salary of specific department******************");
        double totalSalary = myList.stream()
                .filter(employee -> employee.getDeptId()==101)
                .map(Employee::getSalary)
                .reduce(0, Integer::sum);
        System.out.println(totalSalary);

        System.out.println("*****Average salary of specific department******************");
        double avgSalary= myList.stream()
                .filter(employee -> employee.getDeptId() == 101)
                .mapToDouble(Employee::getSalary)
                .average().orElse(0.0);
        System.out.println(avgSalary);

        System.out.println("*******************second highest salary from each department*************************");
        // Group employees by department (deptId)
        Map<Integer, List<Employee>> departmentEmployees = myList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId));

        System.out.println("Find the second highest salary employee in each department");
        departmentEmployees.forEach((departmentId, employees) -> {
            List<Employee> secondHighestSalaryEmployees = employees.stream()
                    .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                    .skip(1) // Skip the first hidsghest salary employee
                    .limit(1) // Take the second highest salary employee
                    .collect(Collectors.toList());

            if (!secondHighestSalaryEmployees.isEmpty()) {
                Employee secondHighSalaryEmployee = secondHighestSalaryEmployees.get(0);
                System.out.println("Department " + departmentId + ": Second highest salary employee is " +
                        secondHighSalaryEmployee.getName() + " with salary " + secondHighSalaryEmployee.getSalary());
            } else {
                System.out.println("Department " + departmentId + ": No second highest salary employee found.");
            }
        });


        Map<String, String> myMap = new HashMap<>();
        myMap.put("red", "rd");
        myMap.put("blue", "bl");
        myMap.put("yellow", "yl");
        myMap.put("orange", "or");
        myMap.put("grey", "gr");
        myMap.put("green", "gn");

        TreeMap<String,String> treeMap = new TreeMap<>(myMap);
        for(Map.Entry<String,String> myTreeMap: treeMap.entrySet()){
            System.out.println("the key: "+myTreeMap.getKey()+" the value: "+myTreeMap.getValue());
        }





//        System.out.println("reversed order");
//        Map<String, String> sortedMap = myMap.entrySet()
//                .stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//
//        //System.out.println("ascending order");
////        Map<String, String> sortedMap = myMap.entrySet()
////                .stream()
////                .sorted(Map.Entry.comparingByKey())
////                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//
//        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
    }
}
