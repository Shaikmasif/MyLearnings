import java.util.Scanner;
import java.util.Stack;

public class StackParanthesis {
	public static void main(String []args) {
		System.out.println("enter string");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char ch[] = str.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		int pairs = 0;
		for(char c : ch) {
			if(c=='{' || c=='[' || c=='(') {
				stack.push(c);
			}else {
			if(!stack.isEmpty()) {
				char top = stack.pop();
				if(c==']' && top=='[' || c==')' && top=='(' || c=='}' && top=='{') {
					pairs+=1;
				}
			}
			
		}
		}
		
		System.out.println(pairs);
	}
  
	
}
