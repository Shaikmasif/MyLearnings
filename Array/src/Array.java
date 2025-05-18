import java.util.Scanner;

public class Array {
	private int arr[];
	private Scanner scan = new Scanner (System.in);
	
	public Array(int n) {
		arr = new int[n];
	}
	
	public void insert() {
		int elem;
		System.out.println("Enter the position from 0 to "+arr.length+" , element to be entered");
		int pos = scan.nextInt();
		System.out.println("Enter the element to insert");
		elem = scan.nextInt();
		arr[pos] = elem;
	}
	
	public void delete() {
		System.out.println("Enter the position, element to be deleted");
		int pos = scan.nextInt();
		System.out.println("Element deleted is "+arr[pos]);
		arr[pos] = 0;
	}
	
	public void display() {
		for(int i = 0;i <= arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
