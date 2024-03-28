package com.java.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ExtractMultipleDataFromFile {
    public static void main(String[] args) {
        String filePath = "D:/yugal.txt";
        HashMap<Integer, String[]> dataMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 1;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                String name = null;
                String mail = null;
                for (String part : parts) {
                    if (part.startsWith("name:")) {
                        name = part.substring(0); // Extract the name, removing "name: "
                    } else if (part.startsWith("mail:")) {
                        mail = part.substring(0); // Extract the mail, removing "mail: "
                    }
                }
                if (name != null && mail != null) {
                    dataMap.put(count, new String[]{name, mail});
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Integer key : dataMap.keySet()) {
            String[] values = dataMap.get(key);
            System.out.println(values[0] +" "+values[1]);
        }
    }
}
