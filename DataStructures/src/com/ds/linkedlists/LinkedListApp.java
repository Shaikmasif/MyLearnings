package com.ds.linkedlists;

import java.util.Scanner;

public class LinkedListApp {
	
	public static void main(String [] args) {
		System.out.println("LinkedList Operatioons");
		boolean flag = Boolean.valueOf(true);
		Scanner scan = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		while(flag) {
			System.out.println("press 1 - insert rear\npress 2 - insert front\npress 3 - delete rear\npress 4 - delete front\npress 5 - display\npress any other number to exit");
			switch(scan.nextInt()) {
			case 1:ll.insertRear();
			break;
			case 2:ll.insertFront();
			break;
			case 3:ll.deleteRear();
			break;
			case 4:ll.deleteFront();
			break;
			case 5:ll.display();
			break;
			default:{
				System.err.println("Exiteed");
			};
			}
		}
	}

}
