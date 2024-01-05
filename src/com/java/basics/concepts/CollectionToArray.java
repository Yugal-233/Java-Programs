package com.java.basics.concepts;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
public class CollectionToArray {
    public static void main(String[] args) {
        Collection<String> collection= new ArrayList<>();
        collection.add("Reema");
        collection.add("Rahul");
        collection.add("Rita");
        collection.add("Ramesh");
        Object[] str = collection.toArray();
        for(int i=0 ;i<str.length;i++){
            System.out.println("Element : "+str[i]);
        }
    }
}
