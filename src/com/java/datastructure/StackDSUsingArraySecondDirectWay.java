package com.java.datastructure;


import java.util.Scanner;

class StackDS2{

    int arr [] =  new int[10];
    int top=-1;
    void push(int data){
        if(top==(arr.length-1)){
            System.out.println("The stack is fully inserted or overflow");
        }else{
            top=top+1;
            arr[top]=data;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("The stack is empty or underflow");
        }else {
            top=top-1;
            System.out.println("Item is deleted");
        }
    }
    void display(){
        System.out.println("The given items are :: ");
        for (int i = top; i >=0; i--) {
            System.out.println(arr[i]);
        }
    }
}
public class StackDSUsingArraySecondDirectWay {
    public static void main(String[] args) {
        StackDS2 s  =  new StackDS2();
        int data = 0;
        int l = 0;
                    s.push(10);
                    s.push(20);
                    s.push(30);
                    s.push(40);
                    s.push(50);
        System.out.println("Items inserted");
                    s.pop();
                    s.display();

    }
}
