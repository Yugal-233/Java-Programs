package com.java.basics.concepts;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsExceptionDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:/Users/Dell/Desktop/abc.text");
        System.out.println(fis.read());
    }
}
