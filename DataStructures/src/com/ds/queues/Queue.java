package com.ds.queues;

import java.util.Scanner;

public class Queue {
	int f = 0;
	int r = -1;
	int size;
	Scanner scan;
	int queue[];
	public Queue(int n) {
		queue = new int[n];
		scan = new Scanner(System.in);
		size = n;
	}
	
	public void enqueue() {
		if(r==size-1) {
			System.out.println("Queue is full");
		}else {
			System.out.println("enter element");
			int element = scan.nextInt();
			r++;
			queue[r] = element;
			System.out.println("element inserted");
		}
	}
	
	public void dequeue() {
		if(r==-1||f>r) {
			System.out.println("Queue is empty");
		}else {
			queue[f]=0;
			f++;
			System.out.println("element removed");
		}
	}
	public void display() {
		if(r==-1||f>r) {
			System.out.println("Queue is empty");
		}else {
		for(int i=f;i<=r;i++) {
			System.out.print(queue[i]+" ");
		}
		}
	}

}
