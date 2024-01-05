package com.java.basics.concepts;

public class InternMethod {
    public static void main(String[] args) {
        String s1 ="yugal";
        String s2 =new String("yugal");
        s2=s1.intern();
        System.out.println(s1==s2);


        String str1 = "mayur";
        String str2 = new String("mayur");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
