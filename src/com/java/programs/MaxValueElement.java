package com.java.programs;

import java.util.Arrays;
import java.util.List;

public class MaxValueElement {
    public static void main(String[] args) {
        List<Integer> myList1 = Arrays.asList(10,20,28,25,75,5,27,18,19,75,20,56,10,83,29,70);

        int max = myList1.stream().max((i1,i2)->i1<i2?-1:i1>i2?1:0).get();
        System.out.println("Max value : "+max);

        int min = myList1.stream().min((i1,i2)->i1<i2?-1:i1>i2?1:0).get();
        System.out.println("Min value : "+min);

        int max1 =  myList1.stream().max(Integer::compare).get();
        System.out.println("Max value : "+max1);

        int min1 = myList1.stream().min(Integer::compare).get();
        System.out.println("Min value : "+min1);
    }
}
