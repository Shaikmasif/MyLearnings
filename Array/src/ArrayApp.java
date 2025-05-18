import java.util.Scanner;

public class ArrayApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int n = scan.nextInt();
		Array array = new Array(n);
		while(true) {
			System.out.println("Press 1 ---> INSERT");
			System.out.println("Press 2 ---> DELETE");
			System.out.println("Press 3 ---> DISPLAY");
			System.out.println("Any Other Number ---> STOP");
			int choice = scan.nextInt();
			switch(choice) {
			case 1: array.insert();
			break;
			case 2: array.delete();
			break;
			case 3: array.display();
			break;
			default: System.exit(0);
			}
		}
	}
}
