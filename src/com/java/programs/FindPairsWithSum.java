package com.java.programs;

import java.util.Arrays;
import java.util.List;

public class FindPairsWithSum {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 20, 30, 50, 40, 8, 60);
        int targetSum = 30;

        for (int i = 0; i < myList.size(); i++) {
            for (int j = i + 1; j < myList.size(); j++) {
                int num1 = myList.get(i);
                int num2 = myList.get(j);
                if (num1 + num2 == targetSum) {
                    System.out.println("Pair found: " + num1 + " + " + num2 + " = " + targetSum);
                }
            }
        }
    }
}
