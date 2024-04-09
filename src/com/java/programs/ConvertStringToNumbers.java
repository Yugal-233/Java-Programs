package com.java.programs;

public class ConvertStringToNumbers {
    public static void main(String[] args) {
        String[][] grid = {
                {"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "I"}
        };

        String input = "CHA";
        StringBuilder output = new StringBuilder();

        for (char c : input.toCharArray()) {
            int row = -1;
            int col = -1;
            // Finding the position of the character in the grid
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j].equals(String.valueOf(c))) {
                        row = i + 1; // Adding 1 because row and column indices start from 1 in the output
                        col = j + 1;
                        break;
                    }
                }
                if (row != -1 && col != -1) {
                    break;
                }
            }
            // Appending the row number to the output
            output.append(row);
            // Appending the column number to the output
            output.append(col);
        }
        System.out.println(output.toString());
    }
}
