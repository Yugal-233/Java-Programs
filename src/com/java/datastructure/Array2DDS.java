package com.java.datastructure;

import java.util.Scanner;

public class Array2DDS {
    public static void main(String[] args) {
        int n,m,i,j;
        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m= sc.nextInt();
        int [][]  arr  = new int[n][m];
        System.out.println("Please enter the elements of the array");
        for (i = 0; i < n; i++) {
            for (j = 0;  j< m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The output of the 2D array");
        for (i = 0; i < n; i++) {
            for (j = 0;  j< m; j++) {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("****************************************************************");
        System.out.println("Second way to display of the arrays");
        int [][] arr2 ={{1,2,3},{4,5,6}};
        System.out.println("output of the Second way to display the arrays");
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(arr2[x][y]+" ");
            }
            System.out.println();
        }
    }
}
