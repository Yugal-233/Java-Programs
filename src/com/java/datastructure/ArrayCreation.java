package com.java.datastructure;

import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {
        int [] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the index data");
        int data = sc.nextInt();
        arr= new int[data];
        System.out.println("Please enter the values");
        for (int i = 0; i < data; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Print");
        for (int i = 0; i < data; i++) {
            System.out.println(arr[i]);
        }
    }
}
