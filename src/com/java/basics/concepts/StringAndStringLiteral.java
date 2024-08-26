package com.java.basics.concepts;

public class StringAndStringLiteral {

    public static void main(String[] args) {
        String s1 = new String("yugal");  // create 2 objs,  in heap and scp
        String s2 = new String("mayur");    // create 2 objs,  in heap and scp
        String s3 = new String("yugal");    // create 1 obj,  in heap only and refer previous scp area line 6
        String s4="amit";                             // create 1 objs,  in scp only
        String s5 = new String("radha");    // create 2 objs,  in heap and scp
        String s6="lina";                             // create 1 objs,  in scp only
        String s7="amit";                              // create 0 objs,  refer scp only
        String s8 = new String("gaju");     // create 2 objs,  in heap and scp

        System.out.println(s4==s7);

    }
}
