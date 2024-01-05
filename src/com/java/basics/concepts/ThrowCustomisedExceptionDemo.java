package com.java.basics.concepts;

import java.util.Scanner;

class AgeLimitException extends RuntimeException{
    public AgeLimitException(String msg){
        super(msg);
    }
}
public class ThrowCustomisedExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Age is valid for voting");
        }else throw new AgeLimitException("Age is not valid for voting");
    }
}
