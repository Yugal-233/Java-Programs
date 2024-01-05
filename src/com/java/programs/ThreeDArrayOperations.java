package com.java.programs;

public class ThreeDArrayOperations {
    public static void main(String[] args) {
        int[][][] arr = {
                {{1,2,3},{2,3,4},{34,2,3}},
                {{1,21,3},{2,23,4},{34,2,31}},
                {{1,2,36},{2,31,4},{34,20,3}},
        };
        int sum=0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[0][0].length; j++) {
                sum=sum+arr[0][i][j];
            }
        }
        System.out.println(sum);
    }
}
