package com.java.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ExtractDataFromFile {
    public static void main(String[] args) {
        String filePath = "D:/yugal.txt";
        HashMap<Integer, String> namesMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 1;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                for (String part : parts) {
                    if (part.startsWith("name:")) {
                        String[] nameParts = part.split(": ");
                        namesMap.put(count, nameParts[1]);
                    }
                }
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Integer key : namesMap.keySet()) {
            System.out.println("Name " + key + ": " + namesMap.get(key));
        }
    }
}
