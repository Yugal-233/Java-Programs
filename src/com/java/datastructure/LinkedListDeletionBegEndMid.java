package com.java.datastructure;

import java.util.Scanner;

public class LinkedListDeletionBegEndMid {
    class Node{
        int data;
        Node next=null;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void insertNode(){
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
                        if (temp.next != null) {
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
    void deleteNode(){
        Scanner sc =  new Scanner(System.in);
        int n = 0;
        do{
        if(head == null){
            System.out.println("The linkedList is empty");
        }else{
            System.out.println("Insertion at beginning: press 1, Insertion at end: press 2, Insertion at middle: press 3");
            int m = sc.nextInt();
            switch (m){
                case 1:
                    Node temp = head;
                    temp=temp.next;
                    head=temp;
                case 2:
                    Node temp1=head;
                    Node ptr= temp1.next;
                    if (ptr.next!=null){
                        temp=ptr;
                        ptr=ptr.next;
                    }
                    temp1.next=null;
                case 3:
                    Node temp2 = head;
                    Node ptr1 = temp2.next;
                    System.out.println("Enter the position where you want deletion operation");
                    int p =sc.nextInt();
                    for (int i = 0; i < p-2 ; i++) {
                        temp2=ptr1;
                        ptr1=ptr1.next;
                    }
                    temp2.next=ptr1.next;


            }
            System.out.println("Do you wan to delete more data :: if then press 1");
            n = sc.nextInt();
        }}while (n==1);
    }
    public void traverseNodes(){
        Node temp=head;
        if(head==null){
            System.out.println("The given linkedlist is empty");
        }else {
            while (temp!=null){
                System.out.println(temp.data+ " " );
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListDeletionBegEndMid d =new LinkedListDeletionBegEndMid();
        d.insertNode();
        d.deleteNode();
        d.traverseNodes();
    }
}
