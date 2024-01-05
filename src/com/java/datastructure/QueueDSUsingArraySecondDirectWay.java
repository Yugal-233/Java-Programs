package com.java.datastructure;

class QueueData{
    int arr[] = new int[10];
    int f=-1,r=-1;

    void enqueue(int i){
        if(r==(arr.length-1)){
            System.out.println("The queue is overflow and items cannot added");
        }else {
            if(f==-1 && r==-1){
                f=0;
                r=0;
                arr[r]=i;
            }else {
                r=r+1;
                arr[r]=i;
            }
        }
    }
    void dequeue(){
        if(f==-1 && r==-1){
            System.out.println("The queue is empty or inderflow");
        }else {
            f=f+1;
        }
    }

    void display(){
        for (int i = f; i <=r ; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class QueueDSUsingArraySecondDirectWay {
    public static void main(String[] args) {
        QueueData q = new QueueData();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.dequeue();
        q.display();


    }
}
