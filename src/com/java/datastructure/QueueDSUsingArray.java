package com.java.datastructure;

import java.util.Scanner;

class QueueDS {

    int n=10;
    int arr[] = new int[n];
    int f=-1,r=-1;

    void enqueue(Scanner sc){
        if(r==(n-1)){
            System.out.println("Queue is completely fulled and cannot insert element");
        }else {
            System.out.println("Enter the data");
            int m = sc.nextInt();
            if(f==-1 && r==-1){
                f=0;
                r=0;
                arr[r]=m;
            }else {
                r=r+1;
                arr[r]=m;
            }
        }
    }

    void dequeue(){
        if(f==-1 && r==-1){
            System.out.println("The queue is empty");
        }else{
            f=f+1;
        }
    }
    void display(){
        System.out.println("Items are");
        for (int i = f; i <= r; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class QueueDSUsingArray {
    public static void main(String[] args) {
        QueueDS q = new QueueDS();
        Scanner sc = new Scanner(System.in);
        int l = 0;
        do {
            System.out.println("Press 1 to enqueue");
            System.out.println("Press 2 to dequeue");
            System.out.println("Press 3 to display");
            int data = sc.nextInt();
            switch (data) {
                case 1:
                    q.enqueue(sc);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
            }
            System.out.println("Enter 0 to gotomain menu");
        }while (l==0);
        System.out.println("Exit");

    }
}
