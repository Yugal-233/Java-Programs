package com.java.programs;

import java.util.Arrays;

public class SquareArray {
    public static void main(String[] args) {
        int [] arr = {-6, -4, -1, 0, 3, 5};
        int[] arrOut = new int[arr.length];
        for (int i = 0;i< arr.length;i++) {
            arrOut[i]=arr[i]*arr[i];
        }
        Arrays.sort(arrOut);
        for(int square: arrOut){
            System.out.println(square);
        }
        System.out.println("***************************************");

        int[] squaredArr = Arrays.stream(arr)
                .map(x -> x * x)
                .toArray();
        for (int sqr: squaredArr){
            System.out.println(sqr);
        }
    }
}
