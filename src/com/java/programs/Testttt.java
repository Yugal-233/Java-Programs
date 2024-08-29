package com.java.programs;

public class Testttt {
    public static void main(String[] args) {
        String s1 = "akash";
        String s2 = new String("akash");
//        String s3 = "akash";
//        String s4 = "akash";

        String s3= s1.intern();

        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        System.out.println(s1==s3);


    }
}
