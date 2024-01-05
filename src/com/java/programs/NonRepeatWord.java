package com.java.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatWord {
    public static void main(String[] args) {
        String str = "apple banana apple cherry banana";

        String [] words = str.split(" ");

        String nonRepeat = null;
        HashMap<String, Integer> myMap =  new HashMap<>();

        for(String word : words){
            myMap.put(word, myMap.getOrDefault(word,0)+1);
        }
        for (String word: words){
            if (myMap.get(word)==1){
                nonRepeat=word;
                break;
            }
        }
        if(nonRepeat!=null){
            System.out.println("present "+nonRepeat);
        }else System.out.println("not present");


        System.out.println("****************Second Approach*****************");

        String str1 = "apple banana apple cherry banana";

        String [] strData= str1.split(" ");

        List<String> words1 = Arrays.asList(strData);

        Map<String, Long> wordCountMap = words1.stream()
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));

        List<String> nonRepeatingWords = wordCountMap.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());

        for(Map.Entry<String, Long> map : wordCountMap.entrySet()){
            if(map.getValue()==1){
                System.out.println(map.getKey());
            }
        }

        System.out.println("Non-repeating words: " + nonRepeatingWords);

        System.out.println("repeating word");
        List<String> duplicateWord=  wordCountMap.entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicateWord);

    }
}
