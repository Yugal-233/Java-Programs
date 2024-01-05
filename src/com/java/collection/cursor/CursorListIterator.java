package com.java.collection.cursor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class CursorListIterator {
    public static void main(String[] args) {
        List myList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        ListIterator l = myList.listIterator();
        while (l.hasNext()) {
            Integer i = (Integer) l.next();
            if (i == 4) {
                l.remove();
            } else if (i == 7) {
                l.add(12);
            } else if (i == 9) {
                l.set(15);
            }
        }
        System.out.println(myList);


        List<String> myList1 = Arrays.asList("yugal", "jayesh", "avneet");

        ListIterator itr = myList1.listIterator();

        while (itr.hasNext()) {
            String data = (String) itr.next();
            System.out.println(data);

        }
    }
}
