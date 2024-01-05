package com.java.programs;

public class TTTTTTT {
    public static void main(String[] args) {
        int[] arr = {2, 3, 15, 23, 46, 7, 8, 9, 24};

        int target = 6;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);

                    }
                }
            }
        }
    }
}
