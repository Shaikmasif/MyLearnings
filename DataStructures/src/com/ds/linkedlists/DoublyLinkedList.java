package com.ds.linkedlists;

import java.util.Scanner;

public class DoublyLinkedList {
	class Node{
		int data;
		Node prelink,nextlink;
		Node(int n){
			data = n;
			prelink=null;
			nextlink=null;
		}
	}
	Node first;
	Scanner scan = new Scanner(System.in);
	public void insertRear() {
		System.out.println("Enter element");
		
		if(first==null) {
			first = new Node(scan.nextInt());
		}else {
			Node temp = first;
			while(temp.nextlink!=null) {
				temp=temp.nextlink;
			}
			Node node= new Node(scan.nextInt());
			temp.nextlink = node;
			node.prelink = temp;
			System.out.println("Element inserted");
			
		}
	}
	public void insertFront() {
		System.out.println("Enter eleemnt");
		int n = scan.nextInt();
		if(first==null) {
			first = new Node(n);
		}else {
			Node node = new Node(n);
			node.nextlink = first;
			first.prelink = node;
			first = node;
			System.out.println("Element inserted");
		}
	}
	public void deleteRear() {
		if(first==null) {
			System.out.println("Deletion not possible");
		}else if(first.nextlink==null) {
			first = null;
			System.out.println("Element deleted");
		}else {
			Node temp = first;
			while(temp.nextlink.nextlink!=null) {
				temp = temp.nextlink;
			}
			temp.nextlink = null;
			System.out.println("Element deleted");
		}
	}

	public void deleteFront() {
		if(first == null) {
			System.out.println("Deletion not possible");
		}else if(first.nextlink==null) {
			first=null;
			System.out.println("Element deleted");
		}else {
			first = first.nextlink;
			first.prelink = null;
			System.out.println("Element deleted");
		}
	}
	public void displayForward() {
		if(first==null) {
			System.out.println("Display not possible");
		}else if(first.nextlink==null) {
			System.out.println("Elements :"+first.data);
		}else {
			Node temp = first;
			System.out.print("Element : ");
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.nextlink;
				
			}
			System.out.println();
		}
	}
	public void displayRear() {
		if(first==null) {
			System.out.println("Display not possible");
		}else if(first.nextlink==null) {
			System.out.println("Element : "+first.data);
		}else {
			Node temp = first;
			System.out.print("Element : ");
			while(temp.nextlink!=null) {
				temp = temp.nextlink;
			}
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.prelink;
				
			}
		}
	}
}
