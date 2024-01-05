package com.java.collection.cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorIterator {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        Iterator itr = arr.iterator();
        while (itr.hasNext()){
            Integer data = (Integer) itr.next();
            if(data%2==0){
                System.out.println(data);
            }else itr.remove();
        }
    }
}
