package com.java.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 17;
        int count=0;
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("prime number");
        }else System.out.println("not prime number");

        System.out.println("****************************************");
        ArrayList<Integer> a=new ArrayList<>();
        for(int x=1; x<=100; x++){
            int c = 0;
            for (int y = 1; y <= x; y++)

                if (x % y == 0)
                    c++;
            if (c == 2)
                a.add(x);
            else
                continue;
        }
        System.out.println(a);
    }
}
