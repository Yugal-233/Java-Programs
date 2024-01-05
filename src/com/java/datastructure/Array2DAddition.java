package com.java.datastructure;

import java.util.Scanner;

public class Array2DAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the rows");
        int n =sc.nextInt();
        System.out.println("Please enter the columns");
        int m = sc.nextInt();
        System.out.println("Please enter the 2D array arr1");
        int[][] arr1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                 arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Print arr1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Please enter the rows");
        int x =sc.nextInt();
        System.out.println("Please enter the columns");
        int y = sc.nextInt();
        System.out.println("Please enter the 2D array arr2");
        int[][] arr2 = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr2[i][j]= sc.nextInt();
            }
        }
        System.out.println("Print arr2");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        int [][] arr3 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr3[i][j]= arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Print addition of arr1+arr2==arr3");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("****************************************************************");
        System.out.println("Second way to do addition of the arrays");
        int [][] arr4 ={{1,2,3},{4,5,6}};
        int [][] arr5 ={{4,5,6},{7,8,9}};
        int [][] arr6 = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr6[i][j]=arr4[i][j]+arr5[i][j];
            }
        }
        System.out.println("output of the Second way to do addition of the arrays");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr6[i][j]+" ");
            }
            System.out.println();
        }

    }
}
