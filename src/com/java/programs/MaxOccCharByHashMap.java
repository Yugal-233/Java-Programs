package com.java.programs;

import java.util.HashMap;
import java.util.Map;

public class MaxOccCharByHashMap {
    public static void main(String[] args) {
        HashMap<Character,Integer> myMap =  new HashMap<>();

        String s = "my name is yugal chaudhari";
        s=s.replaceAll(" ","");
        for(char c :s.toCharArray()){
            if(myMap.containsKey(c)){
                myMap.put(c, myMap.get(c)+1);
            }else myMap.put(c,1);
        }
        System.out.println(myMap);
        int max=0;
        char maxChar = ' ';

        for (Map.Entry<Character, Integer> map : myMap.entrySet()){
            if(max<map.getValue()){
                max=map.getValue();
                maxChar=map.getKey();

            }
        }
        System.out.println("Max number occurred character : "+max + " : "+"max time occurred character: "+maxChar);

        Character character2 = myMap.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
        System.out.println("character2: "+character2);

    }
}
