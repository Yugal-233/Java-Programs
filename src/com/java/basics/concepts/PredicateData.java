package com.java.basics.concepts;

import java.util.function.Predicate;

public class PredicateData {
    public static void main(String[] args) {
        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(10));
        System.out.println(p.test(15));

        System.out.println("************************************");

        String [] str = {"yugal","raghav","abhinandan","prem","nageshwar"};
        Predicate<String> s = s1->s1.length()>5;
        for(String s2: str){
            if(s.test(s2)){
                System.out.println(s2);
            }
        }
        System.out.println("************************************");
        Predicate<String> s1 = str1->str1.length()%2==0;
        for(String str2: str){
            if(s1.test(str2)){
                System.out.println(str2);
            }
        }
        System.out.println("************************************");
        int [] arr = {0,5,4,10,59,50,60,34,78,65};
        Predicate<Integer> p1 = arr1->arr1%2==0;
        Predicate<Integer> p2 = arr1->arr1>10;
        System.out.println("use of and");
        for(Integer a : arr){
            if(p1.and(p2).test(a))
                System.out.println("Print the numbers:: "+a);
        }
        System.out.println("************************************");
        System.out.println("use of or");
        for(Integer a : arr){
            if(p1.or(p2).test(a))
                System.out.println("Print the numbers:: "+a);
        }
        System.out.println("************************************");
        System.out.println("use of negate");
        for(Integer a : arr){
            if(p1.negate().test(a))
                System.out.println("Print the numbers:: "+a);
        }
    }
}
