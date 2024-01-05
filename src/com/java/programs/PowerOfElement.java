package com.java.programs;

public class PowerOfElement {
    public static void main(String[] args) {
        double base = 2.0; // Base value
        double exponent = 3.0; // Exponent value
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        System.out.println("************normal way*********");

        int base1=2;
        int power=3;
        int result1=1;
        for (int i = 1; i <=power ; i++) {
            result1=base1*result1;
        }
        System.out.println(result1);
    }
}