package com.java.programs;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class OTPGeneration {
    public static void main(String[] args) {
        System.out.println("First way");
        Supplier<String> c = ()->{
            String otp= "";
            for (int i = 0; i < 6; i++) {
                otp= otp + (int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(c.get());

        System.out.println("Second way");
        int randomOTP= (int)(Math.random()*9000)+1000;
        String OTPGenerate= String.valueOf(randomOTP);
        System.out.println(OTPGenerate);
    }
}
