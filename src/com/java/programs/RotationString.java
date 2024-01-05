package com.java.programs;

public class RotationString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String originalString = "tushar";
        int rotationChar = 2;

        rightRotationString(originalString, rotationChar);
        leftRotationString(originalString, rotationChar);
    }

    private static void rightRotationString(String originalString, int rotationChar) {
        int rotation = rotationChar % originalString.length(); // Ensure rotation is within string length
        String rightRotate = originalString.substring(originalString.length() - rotation) + originalString.substring(0, originalString.length() - rotation);
        System.out.println(rightRotate);
    }

    private static void leftRotationString(String originalString, int rotationChar) {
        int rotation = rotationChar % originalString.length(); // Ensure rotation is within string length
        String leftRotate = originalString.substring(rotation) + originalString.substring(0, rotation);
        System.out.println(leftRotate);
    }
}
