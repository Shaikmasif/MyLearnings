import java.util.Scanner;

public class DoublyLinkedList {
	
	class Node{
		Node prelink;
		int data;
		Node nextlink;
	}
	private Node first;
	private Scanner scan = new Scanner(System.in);
	
	public void insert_front(){
		System.out.println("Enter an element");
		int elem = scan.nextInt();
		Node newnode = new Node();
		newnode.data = elem;
		newnode.prelink = null;
		newnode.nextlink = null;
		if(first == null) {
			first = newnode;
		}
		else {
			newnode.nextlink = first;
			first.prelink = newnode;
			first = newnode;
		}
	}
	
	public void delete_front() {
		if(first == null) {
			System.out.println("Deletion not possible");
		}else if(first.nextlink == null) {
			System.out.println("Element deleted is "+first.data);
			first = null;
		}else {
			System.out.println("Element deleted is "+first.data);
			first = first.nextlink;
			first.prelink = null;
		}
	}
	
	public void insert_rear() {
		System.out.println("Enter an element");
		int elem = scan.nextInt();
		Node newnode = new Node();
		newnode.data = elem;
		newnode.nextlink = null;
		newnode.prelink = null;
		if(first == null) {
			first = newnode;
		}else {
			Node temp = first;
			while(temp.nextlink!=null) {
				temp = temp.nextlink;
			}
			temp.nextlink = newnode;
			newnode.prelink = temp;
		}
	}
	
	public void delete_rear() {
		if(first == null) {
			System.out.println("Deletion not possible");
		}else if(first.nextlink == null) {
			System.out.println("Element deleted is "+first.data);
		}else {
			Node temp = first;
			while(temp.nextlink.nextlink!=null) {
				temp = temp.nextlink;
			}
			System.out.println("Element deleted is "+temp.nextlink.data);
			temp.nextlink = null;
		}
	}
	
	public void display_forward() {
		if(first == null) {
			System.out.println("Display not possible");
			
		}else if(first.nextlink == null) {
			System.out.println(first.data);
		}else {
			Node temp = first;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.nextlink;
			}
		}
		System.out.println();
	}
	
	public void display_reverse() {
		if(first == null) {
			System.out.println("Display not possible");
		}else if(first.nextlink == null) {
			System.out.println(first.data);
		}else {
			Node temp = first;
			while(temp.nextlink!=null) {
				temp = temp.nextlink;
			}
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.prelink;
			}
		}
		System.out.println();
	}
}
