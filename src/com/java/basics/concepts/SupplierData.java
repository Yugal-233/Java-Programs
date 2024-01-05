package com.java.basics.concepts;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierData {
        ///get OTP logic
    public static void main(String[] args) {
        Supplier<String> s = ()->{
            String otp="";
            for(int i=0;i<6;i++){
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(s.get());

        System.out.println("*******************************");

        Supplier<Date> myDate = ()->new Date();
        System.out.println(myDate.get());

    }
}
