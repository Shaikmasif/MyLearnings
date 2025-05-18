import java.util.Scanner;

public class CircularQueue {
	private int cq[];
	private int size;
	private int r = -1;
	private int f = 0;
	private int count = 0;
	private Scanner scan = new Scanner(System.in);
	
	public CircularQueue(int n) {
		cq = new int[n];
	    size = cq.length;
	}
	
	public void insert() {
		if(count == size) {
			System.out.println("Insertion Not Possible");
		}else {
			System.out.println("Enter an element");
			int element = scan.nextInt();
			r = (r+1)%size;
			cq[r] = element;
			count++;
		}
	}
	
	public void delete() {
		if(count == 0) {
			System.out.println("Deletion not possible");
		}else {
			System.out.println("Element deleted is "+cq[f]);
			f = (f+1)%size;
			count--;
		}
	}
	
	public void display() {
		int f1 = f;
		if(count == 0) {
			System.out.println("Displaying not possible");
		}else {
			for(int i = 1;i <= count;i++) {
				System.out.print(cq[f1]+" ");
				f1 = (f1+1)%size;
			}
		}
	}
	
	public void exit() {
		System.err.println("Mission Aborted");
		System.exit(0);
	}
}
