package com.java.datastructure;

import java.util.Scanner;

public class LinkedListSinglyDS1 {
        class Node{
            int data;
            Node next;
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        Node head = null;
        void addNodes() {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Please enter the data");
                int data = sc.nextInt();
                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                } else {
                    newNode.next = head;
                    head = newNode;
                }
                System.out.println("Continue to add data :: press1 ");
                n = sc.nextInt();
            } while (n == 1);
        }
        void displayNodesAndData(){
            Node currentNode= head;
            if(head==null){
                System.out.println("The given linkedList is empty");
            }else{
                while (currentNode!=null){
                    System.out.println("Printing the nodes :: " +currentNode.data);
                    currentNode=currentNode.next;
                }
            }
        }

        ///Second way of singly linked list
    public Node addNodesInLL(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
            }else {
                newNode.next=head;
                head=newNode;
            }
            return head;
    }



    public static void main(String[] args) {
        System.out.println("First way to display the linkedList");
        LinkedListSinglyDS1 s =  new LinkedListSinglyDS1();
        s.addNodes();
        s.displayNodesAndData();

        System.out.println("****************************************");
        System.out.println("Second way to display the linkedList");
        s.addNodesInLL(11);
        s.addNodesInLL(22);
        s.addNodesInLL(33);
        s.addNodesInLL(44);
        s.displayNodesAndData();

    }
}
