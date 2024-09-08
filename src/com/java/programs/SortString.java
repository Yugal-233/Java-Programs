package com.java.programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SortString {
    public static void main(String[] args) {
        String str = "bcda";

        char[] ch1 = str.toCharArray();
        Arrays.sort(ch1);
        for (int i = 0; i < ch1.length; i++) {
            System.out.print(ch1[i]+" ");
        }
        System.out.println();
        System.out.println("******************************");

        char[] ch = str.toCharArray();
        char temp = ' ';
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if(ch[i]<ch[j]){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        System.out.println(ch);

        System.out.println("****************another approach***********");
        String collect = str.chars().sorted().mapToObj(c -> (char) c).map(String::valueOf).collect(Collectors.joining());
        System.out.println(collect);
    }
}
