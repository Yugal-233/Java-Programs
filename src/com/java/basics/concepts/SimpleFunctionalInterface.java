package com.java.basics.concepts;

interface LambdaExpressionWithFunction{
    void display();
}
public class SimpleFunctionalInterface {
    public static void main(String[] args) {
        LambdaExpressionWithFunction lambdaExpression = ()-> System.out.println("Yugal");
        lambdaExpression.display();
    }
}
