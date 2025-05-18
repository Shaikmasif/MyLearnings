package com.ds.linkedlists;

import java.util.Scanner;

public class LinkedList {
	class Node{
		int data;
		Node link;
		public Node(int n) {
			data = n;
			link = null;
		}
	}
	Scanner scan = new Scanner(System.in);
	Node first;
	
	public void insertRear() {
		System.out.println("Enter element");
		int n = scan.nextInt();
		if(first==null) {
			Node node = new Node(n);
			first = node;
		}else {
			Node temp = first;
			while(temp.link!=null) {
				temp=temp.link;
			}
			Node node = new Node(n);
			temp.link = node;
			
		}
		System.out.println("Element inserted");
	}
	public void insertFront() {
		System.out.println("Enter element");
		int n = scan.nextInt();
		if(first==null) {
			Node node = new Node(n);
			first = node;
		}else {
			Node node = new Node(n);
			node.link=first;
			first=node;
		}
		System.out.println("Elemet inserted");
		
	}
	public void deleteRear() {
		if(first==null) {
			System.out.println("Deletion not possible");
		}else if(first.link==null) {
			first=null;
			System.out.println("Element deleted.");
		}else {
			Node temp = first;
			while(temp.link.link!=null) {
				temp=temp.link;
			}
			temp.link=null;
			System.out.println("Element deleted.");
		}
	}
	public void deleteFront() {
		if(first==null) {
			System.out.println("Deleteion not possible");
		}else if(first.link==null) {
			first=null;
			System.out.println("Element deleted");
		}else {
			first = first.link;
			System.out.println("Element deleted");
		}
	}
	
	public void display() {
		if(first==null) {
			System.out.println("Display not possible");
		}else if(first.link==null){
			System.out.println("Element : "+first.data);
		}else {
			Node temp = first;
			System.out.print("Elements : ");
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.link;
			}
		}
	}

}
