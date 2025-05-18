import java.util.Scanner;

public class DoublyLinkedListApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList dll = new DoublyLinkedList();
		
		while(true) {
			System.out.println("Press 1 ---> Insert_Rear");
			System.out.println("Press 2 ---> Delete_Rear");
			System.out.println("Press 3 ---> Insert_Front");
			System.out.println("Press 4 ---> Delete_Front");
			System.out.println("Press 5 ---> Display_Forward");
			System.out.println("Press 6 ---> Display_Reverse");
			System.out.println("Any other ---> STOP");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1: dll.insert_rear();break;
			case 2: dll.delete_rear();break;
			case 3: dll.insert_front();break;
			case 4: dll.delete_front();break;
			case 5: dll.display_forward();break;
			case 6: dll.display_reverse();break;
			default: System.exit(0);
			}
		}
	}
}
