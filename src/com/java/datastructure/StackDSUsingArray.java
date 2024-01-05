package com.java.datastructure;

import java.util.Scanner;

class StackDS{

    int arr [] =  new int[10];
    int top=-1;
    void push(Scanner sc){
        if(top==(arr.length-1)){
            System.out.println("The stack is fully inserted or overflow");
        }else{
            System.out.println("Enter the data");
            int m = sc.nextInt();
            top=top+1;
            arr[top]=m;
            System.out.println("Items inserted");
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

public class StackDSUsingArray {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        StackDS s  =  new StackDS();    
        int l = 0;
        do{
            System.out.println("press 1  to push");
            System.out.println("press 2  to pop");
            System.out.println("press 3  to display");
           int d=sc.nextInt();
           switch (d){
               case 1:
                   s.push(sc);
                   break;
               case 2:
                   s.pop();
                   break;
               case 3:
                   s.display();
                   break;
           }
            System.out.println("Enter 0 togoback to the main menu");
            System.out.println("Enter any key");
        }while (l==0);
            System.out.println("Exit successfully");

    }
}
