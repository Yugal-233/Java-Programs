package com.java.programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PalindromeString {
    public static void main(String[] args) {

        System.out.println("*************************************");
        String xyz= "aba";
        String pqr = Stream.of(xyz)
                .map(s->new StringBuffer(xyz).reverse().toString()).collect(Collectors.joining());
        if(xyz.equalsIgnoreCase(pqr)){
            System.out.println("Palondrome");
        }else System.out.println("not");

        System.out.println("********************************");
        String abc = "aba";
        String rev ="";
        for (int i = abc.length()-1; i >=0 ; i--) {
            rev= rev+abc.charAt(i);
        }
        if(abc.equalsIgnoreCase(rev)){
            System.out.println("palindrome");
        }else System.out.println("not");


        System.out.println("********************************");
        String s1 ="aba";
        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();
        String s2 = sb.toString();
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Palindrome");
        }else System.out.println("not");
    }
}
