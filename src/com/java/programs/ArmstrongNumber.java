package com.java.programs;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int temp,r;
        int cube=0;
        temp=n;
        while (n!=0){
            r= n%10;
            cube= cube+(r*r*r);
            n=n/10;
        }
        if(temp==cube){
            System.out.println("armstrong");
        }else System.out.println("not");
    }
}
