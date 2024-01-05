package com.java.datastructure;

public class ArrayDetails {
    public static void main(String[] args) {
        int [] arr1;     /////initialization of array
        arr1= new int[]{10,20,30};   /////declaration of the array

        int [] arr2 = new int[3];   ///declaration of array
        arr2[0] =10;
        arr2[1]=40;
        arr2[2]=60;

        System.out.println("first array printed");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("second array printed");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        ///// 2D Array code impl
        int [][] arr3;    /////initialization
        arr3= new int[][]{{1, 2, 3, 4}, {4, 5, 6, 8}}; /// declaration
        System.out.println("first 2D array printed");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr3[i][j]);
            }
        }
        int[][] arr4;
        arr4=new int[2][2];
        arr4[0][0]=67;
        arr4[0][1]=45;

        arr4[1][0]=56;
        arr4[1][1]=93;

        System.out.println("second 2D array printed");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(arr4[i][j]);
            }
        }




    }
}
