package com.java.programs;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        int a = 356545;

        String str = Integer.toString(a);
        char c = str.charAt(0);
        char c1 = str.charAt(str.length()-1);

        int numericValue = Character.getNumericValue(c);
        int numericValue1 = Character.getNumericValue(c1);

        System.out.println(numericValue1+numericValue);


        System.out.println("second way.");

        int num = 12345;
        int lastdigit = num % 10;
        int firstdigit = num;
        while (firstdigit >= 10) {
            firstdigit = firstdigit / 10;
        }
        System.out.println(firstdigit + lastdigit);
    }
}
