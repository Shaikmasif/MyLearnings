package com.ds.arrays;

import java.util.Scanner;

public class ArrayApp {
	public static void main(String[] args) {
		System.out.println("Array Operations");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array to be created");
		int n = scan.nextInt();
		ArrayExample arr = new ArrayExample(n);
		boolean flag = true;
		while(flag) {
			System.out.println("press 1 --- Add element");
			System.out.println("press 2 --- Delete element");
			System.out.println("press 3 --- Display element");
			System.out.println("press any other key to quit");
			int key = scan.nextInt();
			switch(key) {
			case 1: arr.insert();
			break;
			case 2: arr.delete();
			break;
			case 3: arr.display();
			break;
			default:{
				System.err.println("Exiting Array Operations");
				flag = false;
			}
			}
		}
	}

}
