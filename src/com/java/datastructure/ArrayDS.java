package com.java.datastructure;

import java.util.Scanner;

public class ArrayDS {
    public static void main(String[] args) {
        int n;
        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Please enter the numbers");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("The results");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("******************************************");
        System.out.println("simple way to print the array");
        int [] arr1 = new int[]{20,50,60,78,63,45,87};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
