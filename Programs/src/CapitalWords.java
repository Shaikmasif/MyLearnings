import java.util.Scanner;

public class CapitalWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String []arr = s.split(" ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = convert(arr[i]);
		}
		for(String i:arr) {
			System.out.print(i+" ");
		}
		
				
	}
	public static String convert(String s) {
		String cap=String.valueOf(s.charAt(0)).toUpperCase();
		for(int i=1;i<=s.length()-1;i++) {
			cap = cap+s.charAt(i);
		}
		return cap;
	}
}
