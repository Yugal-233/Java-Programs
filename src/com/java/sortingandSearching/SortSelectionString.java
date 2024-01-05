package com.java.sortingandSearching;

public class SortSelectionString {
    public static void main(String[] args) {
        System.out.println("Note all the elements should be small or capital letters only");
        String arr[] =  new String[]{"yugal", "chaudhari", "radha", "lina","mayur","gajanan"};
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[min])<0){
                    min=j;
                }
            }
            String temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
