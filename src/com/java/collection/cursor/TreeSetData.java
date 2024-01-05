package com.java.collection.cursor;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        if(i1<i2){
            return 1;
        } else if (i1>i2) {
            return -1;
        }else return 0;
    }
}

public class TreeSetData {
    public static void main(String[] args) {
        TreeSet t  = new TreeSet();
        t.add(10);
        t.add(50);
        t.add(20);
        System.out.println(t);

        System.out.println("**********Second way*******************");

        TreeSet t1  = new TreeSet(new MyComparator());
        t1.add(10);
        t1.add(50);
        t1.add(20);
        System.out.println(t1);

        System.out.println("**********Third way*******************");

        TreeSet t2  = new TreeSet();
        t2.add(new StringBuffer(10));
        t2.add(new StringBuffer(60));
        t2.add(new StringBuffer(15));
        System.out.println(t2);
    }
}
