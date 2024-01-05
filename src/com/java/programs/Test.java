package com.java.programs;

public class Test {
        public static void main(String[] args) {
            // Declare and initialize a 3x4 matrix of integers
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
            };
            // Display the matrix
            System.out.println("Matrix:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

}
