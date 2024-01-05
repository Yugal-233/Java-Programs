package com.java.datastructure;

import java.util.Scanner;

class QueueDS1{
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node f = null;
    Node r = null;
    void enqueue(Scanner sc) {
        int n;
        System.out.println("Please enter the data");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if (f == null) {
            f = newNode;
            r=newNode;
        } else {
            r.next=newNode;
            r=newNode;
        }
    }
    void dequeue(){
        if(f==null){
            System.out.println("The given queue is empty");
        }else {
            f=f.next;
        }
    }
    void display(){
        Node currentNode= f;
        if(f==null){
            System.out.println("The given linkedList is empty");
        }else{
            while (currentNode!=null){
                System.out.println("Printing the nodes :: " +currentNode.data);
                currentNode=currentNode.next;
            }
        }
    }
}

public class QueueDSUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        QueueDS1 s  =  new QueueDS1();
        int l = 0;
        do{
            System.out.println("press 1  to push");
            System.out.println("press 2  to pop");
            System.out.println("press 3  to display");
            int d=sc.nextInt();
            switch (d){
                case 1:
                    s.enqueue(sc);
                    break;
                case 2:
                    s.dequeue();
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
