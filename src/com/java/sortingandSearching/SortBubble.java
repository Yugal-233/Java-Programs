package com.java.sortingandSearching;

public class SortBubble {
    public static void main(String[] args) {
        int arr[]  = new int[]{10,50,-63,40,98,-21,56,73,-42};
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
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr[arr.length-2]);  ///second-highest number
    }
}
