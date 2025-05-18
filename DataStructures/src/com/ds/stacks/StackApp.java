package com.ds.stacks;

import java.util.Scanner;

public class StackApp{
	public static void main(String[] args) {
		System.out.println("Stack Operations");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Stack to be created");
		int n = scan.nextInt();
		Stack arr = new Stack(n);
		boolean flag = true;
		while(flag) {
			System.out.println("press 1 --- push element");
			System.out.println("press 2 --- pop element");
			System.out.println("press 3 --- Display elements");
			System.out.println("press any other key to quit");
			int key = scan.nextInt();
			switch(key) {
			case 1: arr.push();
			break;
			case 2: arr.pop();
			break;
			case 3: arr.display();
			break;
			default:{
				System.err.println("Exiting Stack Operations");
				flag = false;
			}
			}
		}
	}

}
