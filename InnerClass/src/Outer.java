
public class Outer {
	
	class Inner{
		int a = 10;
		int b = 20;
	}
	
	int c = 30;
	void display() {
		Inner i = new Inner();
		System.out.println(i.a);
		System.out.println(i.b);
	}
}
