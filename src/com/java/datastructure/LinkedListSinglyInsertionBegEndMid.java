package com.java.datastructure;

import java.util.Scanner;

public class LinkedListSinglyInsertionBegEndMid {
   class Node{
       int data;
       Node next;
       public Node(int data) {
           this.data = data;
           this.next = null;
       }
   }
   Node head =null;
   void insertNode() {
       int data;
       Scanner sc = new Scanner(System.in);
       int n;
       do {
           System.out.println("Please enter the data");
           data = sc.nextInt();
           Node newNode = new Node(data);
           if (head == null) {
               head = newNode;
           } else {
               System.out.println("Insertion at beginning: press 1, Insertion at end: press 2, Insertion at middle: press 3");
               int m = sc.nextInt();
               switch (m) {
                   case 1:
                       newNode.next = head;
                       head = newNode;
                       break;
                   case 2:
                       Node temp = head;
                       while (temp.next != null) {
                           temp = temp.next;
                       }
                       temp.next = newNode;
                       break;
                   case 3:
                       Node temp1 = head;
                       System.out.println("Enter the position where you want to insert the data");
                       int p = sc.nextInt();
                       for (int i = 0; i < (p - 1); i++) {
                           temp1 = temp1.next;
                       }
                       newNode.next = temp1.next;
                       temp1.next = newNode;
                       break;
               }
           }
           System.out.println("Press 1 to continue to add data");
           n = sc.nextInt();
       } while (n == 1);
   }
   void traveseNodeAndData(){
       Node temp = head;
       if(head==null){
           System.out.println("The given linked List is empty");
       }else {
           while (temp!=null){
               System.out.println("The data : "+temp.data);
               temp=temp.next;
           }
       }
   }

    public static void main(String[] args) {
        LinkedListSinglyInsertionBegEndMid ll =  new LinkedListSinglyInsertionBegEndMid();
        ll.insertNode();
        ll.traveseNodeAndData();
    }
}
