package com.java.sortingandSearching;

public class SearchLinearSecondDirectWay {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==10){
                count++;
            }
        }
        if(count>0){
            System.out.println("item exist");
        }else {
            System.out.println("item doesnt exist");
        }

        System.out.println("*****************Another way***************************");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==10){
                System.out.println("The given item is present and the index of the item is :: "+(i));
            }
        }
        int data = 0;
        if(data == arr.length){
            System.out.println("The item doesnt exist");
        }
    }
}
