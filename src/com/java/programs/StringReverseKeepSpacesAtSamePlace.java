package com.java.programs;

public class StringReverseKeepSpacesAtSamePlace {

    public static void main(String[] args) {
        String str = "i am java developer";
        char [] strArr = str.toCharArray();
        char [] resultArr = new char[strArr.length];
        for(int i=0;i<strArr.length;i++) {
            if(strArr[i]==' ') {

                resultArr[i]=' ';
            }
        }
        int j = strArr.length-1;
        for(int i=0;i<strArr.length;i++) {
            if(strArr[i]!=' ') {
                while(resultArr[j]==' ') {
                    j--;
                }
                resultArr[j]=strArr[i];
                j--;
            }
        }
        System.out.println(str);
        System.out.println(String.valueOf(resultArr));
    }

}

