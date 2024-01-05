package com.java.programs;

public class PalindromeInteger {
    public static void main(String[] args) {
        int n = 121;
        int r, temp;
        int sum=0;
        temp=n;
        while (n>0){
            r=n%10;
            sum= (sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("palindrome");
        }else{
            System.out.println("not");
        }
    }
}
