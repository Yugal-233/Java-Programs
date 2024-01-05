package com.java.collection.cursor;

import java.util.HashMap;
import java.util.Map;

public class MapData {
    public static void main(String[] args) {

        Map<Integer,String> myData =  new HashMap<>();
        System.out.println(myData.put(101,"yugal"));
        System.out.println(myData.put(102,"mayur"));
        System.out.println(myData.put(101,"yugal"));
    }
}
