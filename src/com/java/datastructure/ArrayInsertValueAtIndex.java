package com.java.datastructure;

import java.util.Scanner;

public class ArrayInsertValueAtIndex {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the index value");
        n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Please enter the values of array");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m;
        System.out.println("Please enter the index");
        m = sc.nextInt();
        System.out.println("Please enter the value at that specific index");
        int p = sc.nextInt();
        int[] arr2 = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i < m) {
                arr2[i] = arr1[i];
            } else if (i == m) {
                arr2[i] = p;
            } else {
                arr2[i] = arr1[i - 1];
            }
        }
        System.out.println("Final values added");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("****************************************************************");
        System.out.println("Second way to delete the index of the arrays");
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr4 = new int[arr3.length + 1];
        System.out.println("output of the Second way to delete the index of the arrays");
        /// it is the index at which we will delete the value
        int l= 200;       ///enter this value at the given index
        for (int i = 0; i < arr3.length+1; i++) {
            if (i < 3) {
                arr4[i] = arr3[i];
            } else if (i == 3) {
                arr4[i]=l;
            } else
                arr4[i] = arr3[i-1];
        }
        for (int i = 0; i < 11; i++) {
            System.out.print(arr4[i] + "  ");
        }

    }
}
