package com.java.datastructure;

class Node{
    int data;
    Node next;
}

class LinkedListData{
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data=data;
        if(head==null){
            head=node;
        }else {
            Node n = head;
            while (n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
    public void show(){
        Node node=head;
        while (node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
    public void reverseShow(){
        reverseShow(head);
    }
    public void reverseShow(Node node){
        if(node==null){
            return;
        }
        reverseShow(node.next);
        System.out.println(node.data);
    }
}
public class LinkedListAddition {
    public static void main(String[] args) {
        LinkedListData listData =  new LinkedListData();
        listData.insert(10);
        listData.insert(5);
        listData.insert(18);
        listData.insert(50);

        listData.show();
        System.out.println();
        listData.reverseShow();
    }
}
