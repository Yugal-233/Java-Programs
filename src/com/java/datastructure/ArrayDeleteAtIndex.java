package com.java.datastructure;

import java.util.Scanner;

public class ArrayDeleteAtIndex {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the value");
        n=sc.nextInt();
        System.out.println("Values in the array");
        int[] arr1 =  new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]= sc.nextInt();
        }
        System.out.println("Please enter the index which is need to delete");
        int m = sc.nextInt();
        int[] arr2 = new int[n-1];
        System.out.println("The value deleted at the particular index");
        for (int i = 0; i < arr1.length; i++) {    //arr1[] = 10 20 30
            if(i<m){
                arr2[i]=arr1[i];
            } else if (i==m) {
              continue;
            }else
                arr2[i-1]=arr1[i];
        }
        System.out.println("The final output after deletion operation");
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr2[i]+" ");
        }

        System.out.println("****************************************************************");
        System.out.println("Second simplest way to delete the index of the arrays");
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr6 = new int[arr5.length - 1];
        int index = 3;
        for (int i = 0; i < arr5.length; i++) {
            if (i < index) {
                arr6[i] = arr5[i];
            } else if (i != index) {
                arr6[i - 1] = arr5[i];
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(arr6[i] + "  ");
        }

        System.out.println("****************************************************************");
        System.out.println("Third way to delete the index of the arrays");
        int [] arr3 ={1,2,3,4,5,6,7,8,9,10};
        int[] arr4 = new int[ arr3.length-1];
        System.out.println("output of the Second way to delete the index of the arrays");
        int k= 3;       /// it is the index at which we will delete the value
        for (int i = 0; i < arr3.length; i++) {
            if(i<3){
                arr4[i]=arr3[i];
            } else if (i==3) {
                continue;
            }else
                arr4[i-1]=arr3[i];
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(arr4[i]+"  ");
        }

    }
}
