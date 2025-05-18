import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MemoryApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of inputs");
		int n = scan.nextInt();
		Memory arr[] = new Memory[n];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter size and name for your input "+(i+1));
			Memory m = new Memory();
			m.size = scan.nextInt();
			m.name = scan.next().charAt(0);
			arr[i]= m;
		}
		Arrays.sort(arr);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i].size+" "+arr[i].name);
		}
		
		System.out.println("Enter the size you have");
		int requiredSize = scan.nextInt();
		int count = n;
		String str = "";
		List<ArrayList> list = new LinkedList<ArrayList>();
		while(count>0) {
		int output = 0;
		ArrayList<Character> ch = new ArrayList<Character>();
		for(int i=0;i<=arr.length-1;i++) {
			char c = arr[i].name;
			if(str.contains(String.valueOf(c))== false) {
			int temp = output+arr[i].size;
			if(temp<=requiredSize) {
				output+=arr[i].size;
				ch.add(arr[i].name);
				str+=String.valueOf(arr[i].name);
				count--;
			}
			}
		}
		list.add(ch);
		}
		System.out.println(list);
		
	}

}
