package com.java.programs;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNoRepeatedCharacter {
    public static void main(String[] args) {
        String str = "abacabad";

        char nonRepeatChar = str.chars().mapToObj(c -> (char) c).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().orElse(null);

        if(nonRepeatChar!=' '){
            System.out.println("present "+nonRepeatChar);
        }else System.out.println("not present");

        System.out.println("**************another approach*****************");

        Map<Character, Long> countChar = str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c, Collectors.counting()));

        Character character1 = countChar.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(character1);

        List<Character> data = countChar.entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(data);

        for(Map.Entry<Character, Long> map : countChar.entrySet()){
            if(map.getValue()>1){
                System.out.println(map.getKey());
                break;
            }
        }
    }
}