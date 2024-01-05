package com.java.sortingandSearching;

import java.util.Scanner;

public class SearchBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements want to add in array");
        int data =  sc.nextInt();
        int arr[] =  new int[data];
        System.out.println("The elements are :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int beg = 0;
        int end = data-1;
        System.out.println("Enter the element which you want to search");
        int element = sc.nextInt();
        int count = 0;
        int mid = 0;
        while (beg<=end){
           mid = (beg + end) / 2;
           if(element==arr[mid]){
               count++;
               break;
           }else if(element>arr[mid]){
               beg=mid+1;
           } else if (element<arr[mid]) {
               end=mid-1;
           }
       }
        if(count>0){
           System.out.println("Element found and the index is at : "+mid);
       }else {
           System.out.println("Element doesnt exist");
       }
    }
}
