package com.java.collection.cursor;

import java.io.*;
import java.util.Properties;

public class PropertiesData {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Properties p =  new Properties();
        //FileInputStream fi =  new FileInputStream("EmplDet.properties");
        FileReader reader=new FileReader("EmplDet.properties");
        p.load(reader);
        System.out.println(p);
        String s = p.getProperty("radha");
        System.out.println(s);
        p.setProperty("profile","software engineer");
        FileOutputStream fo = new FileOutputStream("EmplDet.properties");
        p.store(fo,"Code implementation is updated");
    }
}
