package ua.Kharkov.Hitman.lessons9;

public class StaticVariable {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		System.out.println(a2.a);
		System.out.println(a2.b);
	}
}
class A {
	int a = 1;
	static int b = 1;

	public A() {
		a++;
		b++;
	}
}
