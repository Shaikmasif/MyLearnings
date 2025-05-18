package com.ds.queues;

import java.util.Scanner;

public class QueueApp{
	public static void main(String[] args) {
		System.out.println("Stack Operations");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Queue to be created");
		int n = scan.nextInt();
		Queue arr = new Queue(n);
		boolean flag = true;
		while(flag) {
			System.out.println("press 1 --- enqueue element");
			System.out.println("press 2 --- dequeue element");
			System.out.println("press 3 --- Display elements");
			System.out.println("press any other key to quit");
			int key = scan.nextInt();
			switch(key) {
			case 1: arr.enqueue();
			break;
			case 2: arr.dequeue();
			break;
			case 3: arr.display();
			break;
			default:{
				System.err.println("Exiting Queue Operations");
				flag = false;
			}
			}
		}
	}

}
