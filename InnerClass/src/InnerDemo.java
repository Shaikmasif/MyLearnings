
public class InnerDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println(o.c);
		Outer.Inner i = o.new Inner();
		System.out.println(i.a);
		System.out.println(i.b);
		o.display();
	}
}
