package com.java.basics.concepts;

public class HeapMemoryAnalytics {
    public static void main(String[] args) {

        long mb = 1024*1024;   ///(1024 byte = 1kb and 1024 kb = 1 mb)
        Runtime r= Runtime.getRuntime();
        System.out.println("Max memory: "+r.maxMemory()/mb);
        System.out.println("Total memory: "+r.totalMemory()/mb); 
        System.out.println("Free memory: "+r.freeMemory()/mb);
        System.out.println("Consumed memory: "+(r.totalMemory()-r.freeMemory())/mb);
    }
}
