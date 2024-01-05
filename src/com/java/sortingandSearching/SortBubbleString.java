package com.java.sortingandSearching;

public class SortBubbleString {
    public static void main(String[] args) {

        System.out.println("Note all the elements should be small or capital letters only");
        String[] arr =  new String[]{"yugal", "chaudhari", "radha", "lina","mayur","gajanan"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j].compareTo(arr[j+1])>0){   ///strin    g equal then 0
                   String temp = arr[j];            ///string greater then 1
                   arr[j]=arr[j+1];                 ///String less then -1
                   arr[j+1]=temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]+" ");
        }
    }
}
