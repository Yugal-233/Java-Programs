package com.java.programs;

public class TwoDArrayOperation {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Sum of diagonal elements
        int diagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            diagonalSum += arr[i][i];
        }
        System.out.println("Sum of diagonal elements: " + diagonalSum);

        // Sum of first row elements
        int firstRowSum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            firstRowSum += arr[0][j];
        }
        System.out.println("Sum of elements in the first row: " + firstRowSum);

        // Sum of first column elements
        int firstColumnSum = 0;
        for (int i = 0; i < arr.length; i++) {
            firstColumnSum += arr[i][0];
        }
        System.out.println("Sum of elements in the first column: " + firstColumnSum);

        // Sum of all elements
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                totalSum += arr[i][j];
            }
        }
        System.out.println("Sum of all elements: " + totalSum);
    }
}
