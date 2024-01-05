package com.java.programs;

import java.util.Arrays;

public class SecondHighestNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{10,50,-63,40,98,-21,56,73,-42};
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[i]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(arr[arr.length-2]);

        System.out.println("*****************");

        int secondHighNum = Arrays.stream(arr).distinct().boxed().sorted((a,b)->b-a).skip(1).findFirst().orElse(null);
        System.out.println(secondHighNum);
    }
}
