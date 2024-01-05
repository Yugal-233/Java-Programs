package com.java.sortingandSearching;

public class SortInsertion {
    public static void main(String[] args) {
        int arr[]  = new int[]{10,50,63,-40,98,21,-56,73,42};
        for (int i = 1; i < arr.length; i++) {
            int temp =arr[i];
            int j=i;
            while (j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
