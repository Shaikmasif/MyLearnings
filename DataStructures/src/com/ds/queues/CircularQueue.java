package com.ds.queues;

import java.util.Scanner;

public class CircularQueue {

	int r = -1;
	int f = 0;
	int size;
	Scanner scan;
	int cq[];
	int count = 0;
	
	public CircularQueue(int n) {
		cq = new int[n];
		size = n;
		scan = new Scanner(System.in);
	}
	
	public void enqueue() {
		if(count == size) {
			System.out.println("Queue is full");
		}else {
			System.out.println("Enter elemment");
			r=(r+1)%size;
			cq[r] = scan.nextInt();
			count++;
			System.out.println("Element added");
		}
	}
	
	public void dequeue() {
		if(r==-1 || count == 0) {
			System.out.println("Queue is empty");
		}else {
			cq[f]=0;
			f=(f+1)%size;
			count--;
			System.out.println("Element removed");
		}
		
	}
	
	public void display() {
		if(r==-1 || count==0) {
			System.out.println("Queue is empty");
		}else {
			int f1 = f;
		for(int i=1;i<=count;i++) {
			System.out.print(cq[f1]+" ");
			f1=(f1+1)%size;
			
		}}
			
	}
}
