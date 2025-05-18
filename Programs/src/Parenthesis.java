import java.util.Scanner;

public class Parenthesis {
	static char stack[];
	static int count;
	static int top = -1;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		int count=checkParenthesis(s);
		System.out.println("Length of the parenthesis is : "+count);
		
	}
	public static int checkParenthesis(String s) {
		stack = new char[s.length()];
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)=='(') {
				insert();
			}
			else {
				delete();
			}
		}
		
		return count;
	}
	public static void insert() {
		if(top!=(stack.length-1)) {
			++top;
			stack[top]='(';
		}
	}
	public static void delete() {
		if(top!=-1) {
			count+=2;
			--top;
		}
		
	}
}
