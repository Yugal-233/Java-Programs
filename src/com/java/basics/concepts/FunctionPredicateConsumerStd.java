package com.java.basics.concepts;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    int marks;
    String name;
    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name=" + name +
                '}';
    }
}

public class FunctionPredicateConsumerStd {
    public static void main(String[] args) {
        Function<Student, String> f = s -> {
            int marks = s.marks;
            String grade = "";
            if (marks >= 80) {
                grade = "A grade";
            } else if (marks >= 60) {
                grade = "B grade";
            } else if (marks >= 35) {
                grade = "C grade";
            } else
                grade = "failed";
            return grade;
        };

        ArrayList<Student> std = new ArrayList<>();
        std.add(new Student(89, "yugal"));
        std.add(new Student(62, "mayur"));
        std.add(new Student(76, "radha"));
        std.add(new Student(20, "leena"));
        std.add(new Student(35, "pritam"));
        std.add(new Student(78, "raghav"));

        //        Student[] std = {
        //        new Student(89, "yugal"),
        //        new Student(62, "mayur"),
        //        new Student(40, "raghav"),
        //        new Student(76, "radha"),
        //        new Student(25, "lina"),
        //        };

        for (Student s1 : std) {
            System.out.println(s1.getName());
            System.out.println(s1.getMarks());
            System.out.println(f.apply(s1));
            System.out.println();
        }
        System.out.println("**************predicate********************");
        Predicate<Student> p = s -> s.marks >= 60;
        for (Student s1 : std) {
            if (p.test(s1)) {
                System.out.println(s1.getName());
                System.out.println(s1.getMarks());
                System.out.println(f.apply(s1));
                System.out.println();
            }
        }

        System.out.println("************consumer************");
        Consumer<Student> c = s -> {
            System.out.println(s.getName());
            System.out.println(s.getMarks());
            System.out.println(f.apply(s));
            System.out.println();
        };
        for (Student s1 : std) {
            c.accept(s1);
        }
    }
}
