package com.java.sortingandSearching;

public class SearchBinarySecondDirectWay {

    public static void main(String[] args) {
        int[] arr =new int[]{10,20,30,40,50,60,100};

        int beg= 0;
        int end = arr.length-1;
        int mid = (beg+end)/2;
        int searchEle= 60;
        while (beg<=end) {
            if (arr[mid] == searchEle) {
                System.out.println("The element is present at index : "+mid+ " and the element is: " + arr[mid]);
                break;
            } else if (arr[mid] < searchEle) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (beg + end) / 2;
        }
        if(beg>end){
            System.out.println("element doesnt exists");
        }

    }
}
