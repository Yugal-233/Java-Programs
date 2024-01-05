package com.java.datastructure;

import java.util.Scanner;

class StackDS1{
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;
    void push() {
        Scanner sc = new Scanner(System.in);
        int n;
            System.out.println("Please enter the data");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (top == null) {
                top = newNode;
            } else {
                newNode.next=top;
                top=newNode;
            }
    }
    void pop(){
        if(top==null){
            System.out.println("The given stack is empty");
        }else {
            top=top.next;
        }
    }
    void display(){
        Node currentNode= top;
        if(top==null){
            System.out.println("The given linkedList is empty");
        }else{
            while (currentNode!=null){
                System.out.println("Printing the nodes :: " +currentNode.data);
                currentNode=currentNode.next;
            }
        }
    }
}

public class StackDSUsingLinkedList {
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
