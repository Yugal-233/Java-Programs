package com.java.sortingandSearching;

import java.util.Scanner;

public class SearchLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements in the array :: ");
        int data = sc.nextInt();
        int arr[] = new int[data];
        System.out.println("The data items are ::");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        System.out.println("Fine element");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        if(count>0){
            System.out.println("Item exist");
        }else System.out.println("Item dosesnt exist");
    }
}
