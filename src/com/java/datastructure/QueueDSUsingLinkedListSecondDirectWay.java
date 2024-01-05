package com.java.datastructure;

class QueueDS2{
    class Node {
        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        Node f =  null;
        Node r = null;
        void enqueue(int data){
            Node newNode = new Node(data);
            if(f ==null){
                f=newNode;
                r=newNode;
            }else {
                r.next=newNode;
                r=newNode;
            }
        }
        void dequeue(){
            if(f==null){
                System.out.println("Queue is empty and cannot perform delete operation");
            }else {
                f=f.next;
            }
        }
        void display(){
            Node temp = f;
            if(f==null){
                System.out.println("The given queue is empty");
            }
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
public class QueueDSUsingLinkedListSecondDirectWay {
    public static void main(String[] args) {
        QueueDS2 q = new QueueDS2();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        q.display();
    }
}
