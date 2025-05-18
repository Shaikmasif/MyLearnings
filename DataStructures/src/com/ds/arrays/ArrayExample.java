package com.ds.arrays;

import java.util.Scanner;

public class ArrayExample {
	private Scanner scan;
	int arr[];
	int size;
	public ArrayExample(int n) {
		arr=new int[n];
		scan = new Scanner(System.in);
		size=n;
	}
	
	public void insert() {
		
			System.out.println("Enter array position");
			int position = scan.nextInt();
			if(position>size-1) {
				System.out.println("Position should be between 0 and"+(size-1)+" as the length of array is "+size);
			}else {
			System.out.println("Enter array element");
			int element = scan.nextInt();
			arr[position]=element;
			System.out.println("Element inserted");
			}
			
		
		
	}
	public void delete() {
		System.out.println("Enter array position");
		int position = scan.nextInt();
		if(position>size-1) {
			System.out.println("Position should be between 0 and"+(size-1)+" as the length of array is "+size);
		}else {
			arr[position]=0;
			System.out.println("Array element deleted");
		}
		
	}
	public void display() {
		System.out.print("Array elements : ");
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}

}
