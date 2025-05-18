package com.ds.stacks;

import java.util.Scanner;

public class Stack {
	int top = -1;
	Scanner scan;
	int size;
	int stack[];
	public Stack(int n) {
		stack = new int[n];
		scan = new Scanner(System.in);
		size = n;
	}
	
	public void push() {
		if(top==size-1) {
			System.out.println("push is not possible");
		}else {
			System.out.println("Enter element to push into stack");
			int element = scan.nextInt();
			top++;
			stack[top]=element;
			System.out.println("Element pushed into stack");
		}
	}

	public void pop() {
		if(top==-1) {
			System.out.println("Pop is not possible");
		}else {
			stack[top]=0;
			top--;
			System.out.println("Element popped out from stack");
		}
	}
	
	public void display() {
		System.out.println("Elements in stack");
		for(int i = top;i>-1;i--) {
			System.out.println(stack[i]);
		}
	}
}
