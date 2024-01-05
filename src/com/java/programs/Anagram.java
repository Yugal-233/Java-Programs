package com.java.programs;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";

        str1.replaceAll(" ","");
        str2.replaceAll(" ","");

        if(str1.length()!=str2.length()){
            System.out.println("both are not anagram");
        }
        char []char1= str1.toCharArray();
        char []char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        if(Arrays.equals(char1,char2)){
            System.out.println("anagram");
        }else System.out.println("not a anagram");
    }
}
