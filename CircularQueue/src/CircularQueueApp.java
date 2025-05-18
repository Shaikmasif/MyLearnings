import java.util.Scanner;

public class CircularQueueApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the circular queue");
		int n = scan.nextInt();
		CircularQueue cq = new CircularQueue(n);
		while(true) {
			System.out.println("Press ---> INSERT");
			System.out.println("Press ---> DELETE");
			System.out.println("Press ---> DISPLAY");
			System.out.println("Any other ---> STOP");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:cq.insert();
			break;
			case 2: cq.delete();
			break;
			case 3: cq.display();
			break;
			default: cq.exit();
			}
		}
	}
}
