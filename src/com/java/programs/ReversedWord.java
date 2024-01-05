package com.java.programs;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReversedWord {
    public static void main(String[] args) {
        String str= "java developer";
        StringBuffer sb = new StringBuffer();
        String [] words = str.split(" ");
        for (int i = words.length-1; i >=0; i--) {
            sb.append(words[i]);
        }
        System.out.println(sb);

        System.out.println("************************************");

        String data= "i am yugal chaudhari";

        String [] splitData = data.split(" ");

        String rev = Arrays.stream(splitData).reduce((word1,word2)->word2 + " " +word1 ).orElse(null);
        System.out.println("Reversed word is : "+rev);

    }
}
