package com.java.programs;

import java.util.Arrays;

public class SecondHighestNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 50, -63, 40, 98, -21, 73, 56, -42};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 2]);

        System.out.println("*****************");

        int secondHighNum = Arrays.stream(arr).distinct().boxed().sorted((a, b) -> b - a).skip(1).findFirst().orElse(0);
        System.out.println(secondHighNum);

        System.out.println("*****************");
        int i = Arrays.stream(arr).sorted().skip(arr.length - 2).findFirst().orElse(0);
        System.out.println(i);
    }
}
