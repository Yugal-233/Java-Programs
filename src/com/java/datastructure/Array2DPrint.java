package com.java.datastructure;

import java.util.Scanner;

public class Array2DPrint {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the row");
        n= sc.nextInt();
        System.out.println("Please enter the columns");
        m=sc.nextInt();
        System.out.println("Please enter the values in the 2D arrays");
        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The final values are :: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("****************************************************************");
        System.out.println("Second way to print of the arrays");
        int [][] arr2 ={{1,2,3},{4,5,6}};
        System.out.println("output of the Second way to print the arrays");
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(arr2[x][y]+" ");
            }
            System.out.println();
        }
    }
}
