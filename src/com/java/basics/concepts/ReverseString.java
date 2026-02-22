package com.java.basics.concepts;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        //////1
        String str = "My name is Yugal";
        String strRev = Stream.of(str)
                .map(s->new StringBuffer(s).reverse().toString())
                .collect(Collectors.joining());
        System.out.println(strRev);

        /////2
        String rev="";
        String str1 = "My name is Mayur";
        for(int i=str1.length()-1;i>=0;i--){
            rev= rev+str1.charAt(i);
        }
        System.out.println(rev);

        /////3
        String str2 = "My name is radha";
        StringBuffer sb = new StringBuffer(str2);
        String strRev2 = sb.reverse().toString();
        System.out.println(strRev2);

        ////4
//        String str3 =  "My name is balu";
//        ArrayList<Character> myList =  new ArrayList<>();
//        for(char c: str3.toCharArray()){
//            myList.add(c);
//        }
//        Collections.reverse(myList);
//        String rev1= myList.stream().map(String::valueOf).collect(Collectors.joining());
//        System.out.println(rev1);
//
//        String str5 = "My name is raghav";
//        ArrayList<Character> myList1 =  new ArrayList<>();
//
//        for(Character c: str5.toCharArray()){
//            myList1.add(c);
//        }
//        Collections.reverse(myList1);
//
//        for(Character c1: myList1){
//            myList1.add(c1);
//        }
//        System.out.println(myList1);

        System.out.println("**********************");

        String ss = "Data reverse";
        String revSS= Stream.of(ss)
                .map(s->new StringBuffer(ss).reverse().toString())
                .collect(Collectors.joining());
        System.out.println(revSS);
    }
}
